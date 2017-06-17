package cci;

import cci.util.Modulo;
import cgt.util.Permissao;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.endereco.Cep;
import cgt.GTGeral;
import javax.swing.JOptionPane;
import cih.principal.FrmPrincipal;
import cih.principal.FrmValidarAcesso;
import cih.principal.JDAjuda;
import cih.principal.JDCargo;
import cih.principal.JDHabilitacao;
import cih.principal.JDRelatorio;
import cih.principal.JDSuporte;
import cih.principal.JPConfiguracoes;
import cih.principal.JPCrud;
import cih.principal.JPInicio;
import cih.principal.JPServico;
import java.util.List;
import javax.mail.MessagingException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CIGeral {
    
    private GTGeral gtGeral;
    private CIInterface ciInterface;
    private FrmPrincipal frmPrincipal;
    private FrmValidarAcesso frmValidarAcesso;
    private JDAjuda ajuda;
    private JDRelatorio relatorio;
    private JPInicio inicio;
    private JPCrud crud;
    private JPServico servico;
    private JPConfiguracoes config;
    private JDSuporte suporte;
    private JDCargo cargo;
    private JDHabilitacao habilitacao;
    private int permissao;
    private Funcionario funcionarioLogado;
    
    public CIGeral(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        this.gtGeral = new GTGeral();
    }

    public void iniciarSistema() {
        gtGeral.inciarBancoDeDados();
        instanciarFrameValidarAcesso();
    }
    
    public boolean cadastrarCargo(String nomeCargo){
        try{
            gtGeral.cadastrarCargo(nomeCargo);
            JOptionPane.showMessageDialog(null, "Cargo Cadastrado!");
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean cadastrarHabilitacao(String categoria){
        try{
            gtGeral.cadastrarHabilitacao(categoria);
            JOptionPane.showMessageDialog(null, "Habilitação Cadastrada!");
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public List<Cargo> consultarCargos(){
       return gtGeral.consultarCargos();
    }
    
    public List<Habilitacao> consultarHabilitacoes(){
        return gtGeral.consultarHabilitacoes();
    }
    
    public void encerrarSessao() {

        int confirmacao = JOptionPane.showConfirmDialog(frmPrincipal, "Deseja Sair ?", "Sair", JOptionPane.YES_NO_OPTION);
        if (confirmacao == 0) {
            instanciarFrameValidarAcesso();
            frmPrincipal.dispose();
        }
    }
    
    public void validarAcesso(String login, String senha) {
 
        int permissao = gtGeral.validarAcesso(login, senha);
        setPermissao(permissao);
        
        if(permissao == Permissao.PERMISSAO_NEGADA){
            JOptionPane.showMessageDialog(frmValidarAcesso, "Acesso Negado", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }else{
            funcionarioLogado = gtGeral.getFuncionarioLogado();
            instanciarFramePrincipal();
            frmValidarAcesso.dispose(); 
        } 
    }
    
    public void identificarPermissaoJPCrud(JButton excluir, JButton alterar, JButton cadastrar, int MODULO) {
        if (this.getPermissao() == Permissao.PERMISSAO_USER) {
            excluir.setEnabled(false);
            if (MODULO == Modulo.FUNCIONARIO) {
                cadastrar.setEnabled(false);
                alterar.setEnabled(false);
            }
        }
    }
    
    public void identificarPermissaoJPInicio(JButton configuracao){
        if(this.getPermissao() == Permissao.PERMISSAO_USER){
            configuracao.setEnabled(false);
        }
    }
    
    public void instanciarFrameValidarAcesso(){
        frmValidarAcesso = new FrmValidarAcesso(ciInterface);
        frmValidarAcesso.setVisible(true);
    }
    
    public void instanciarFramePrincipal(){
        frmPrincipal = new FrmPrincipal(ciInterface);
        frmPrincipal.setVisible(true);
    }
    
    public JPCrud instanciarJPCrud(JFrame pai , int MODULO){
        crud = new JPCrud(pai, MODULO, ciInterface);
        return crud;
    }
    
    public JPServico instanciarJPServico(JFrame pai , int MODULO){
        servico = new JPServico(pai, MODULO, ciInterface);
        return servico;
    }
    
    public JPConfiguracoes instanciarJPConfiguracoes(JFrame pai){
        config = new JPConfiguracoes(pai, ciInterface);
        return config;
    }
    
    public JPInicio instanciarPainelInicio(FrmPrincipal pai){
        
        inicio = new JPInicio(pai, ciInterface); 
        return inicio;
    }
    
    public void instanciarTelaAjuda(JFrame pai){
        ajuda = new JDAjuda(pai, true, ciInterface);
        ajuda.setVisible(true);      
    }
    
    public void instanciarTelaRelatorio(JFrame pai){
        relatorio = new JDRelatorio(pai, true, ciInterface);
        relatorio.setVisible(true);
    }
    
    public void instanciarTelaSuporte(JFrame pai){
        suporte = new JDSuporte(pai, true, ciInterface);
        suporte.setVisible(true);  
    }
    
    public void instanciarTelaCadastroCargo(JFrame pai){
        cargo = new JDCargo(pai, true, ciInterface);
        cargo.setVisible(true);
    }
    
    public void instanciarTelaCadastroHabilitacao(JFrame pai){
        habilitacao = new JDHabilitacao(pai, true, ciInterface);
        habilitacao.setVisible(true);
    }
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        gtGeral.enviarEmail(emailDestinatario, mensagem, telefone);
    }  
    
    public Cep consultarCep(String cep){
        return gtGeral.consultarCep(cep);
    } 

    public int getPermissao() {
        return permissao;
    }
    
    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }
    
    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }
}
