package cci;

import cgt.GTGeral;
import javax.swing.JOptionPane;
import cih.FrmPrincipal;
import cih.FrmValidarAcesso;
import cih.JDAjuda;
import cih.JDRelatorio;
import cih.JDSuporte;
import cih.JPInicio;
import javax.mail.MessagingException;
import javax.swing.JFrame;

public class CIGeral {
    
    private GTGeral gtGeral;
    private CIInterface ciInterface;
    private FrmPrincipal frmPrincipal;
    private FrmValidarAcesso frmValidarAcesso;
    private JDAjuda ajuda;
    private JDRelatorio relatorio;
    private JPInicio inicio; 
    private JDSuporte suporte;

    public CIGeral(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        this.gtGeral = new GTGeral();
    }

    public void iniciarSistema() {
         frmValidarAcesso = new FrmValidarAcesso(ciInterface);
         frmValidarAcesso.setVisible(true);
    }
    
    public void encerrarSessao() {
        //JOptionPane.showConfirmDialog(null, "Deseja sair ?");
        frmValidarAcesso = new FrmValidarAcesso(ciInterface);
        frmValidarAcesso.setVisible(true);
        frmPrincipal.dispose();
    }
    
    public void validarAcesso(String login, String senha) {
        if ( login.equals("") && senha.equals("") ) {
            if ( frmPrincipal == null )
                frmPrincipal = new FrmPrincipal(ciInterface);
            frmPrincipal.setVisible(true);
            frmValidarAcesso.dispose();
        } else {
            JOptionPane.showMessageDialog(frmValidarAcesso, "Acesso Negado");
        }
    }
    
    public JPInicio abrirInicio(FrmPrincipal pai){
        
        inicio = new JPInicio(pai, ciInterface); 
        //JPanel principal = pai.getjPanelPrincipal();
        //trocarPanel(principal, inicio);
        return inicio;
    }
    
    public void abrirAjuda(JFrame pai){
        ajuda = new JDAjuda(pai, true, ciInterface);
        ajuda.setVisible(true);      
    }
    
    public void abrirRelatorio(JFrame pai){
        relatorio = new JDRelatorio(pai, true, ciInterface);
        relatorio.setVisible(true);
    }
    
    public void abrirSuporte(JFrame pai){
        suporte = new JDSuporte(pai, true, ciInterface);
        suporte.setVisible(true);  
    }
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        gtGeral.enviarEmail(emailDestinatario, mensagem, telefone);
    }
}
