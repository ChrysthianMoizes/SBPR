package cgt;

import cgt.util.SBPRException;
import cdp.Cargo;
import cdp.Habilitacao;
import cdp.endereco.Cep;
import cgd.Config;
import cgd.GDEndereco;
import cgd.GDGeral;
import csw.WebServiceEmail;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.List;
import javax.mail.MessagingException;


public class GTGeral {
    
    private Config config;
    private GDGeral gdGeral;
    private GDEndereco gdEndereco;

    public GTGeral() {
        gdGeral = new GDGeral();
        gdEndereco = new GDEndereco();
    }

    public void cadastrarCargo(String nomeCargo) throws SQLException, ClassNotFoundException, SBPRException{
        
        if(!ValidaCampos.validarNome(nomeCargo))
            throw new SBPRException(20);
        
        Cargo cargo = new Cargo(nomeCargo);
        gdGeral.cadastrar(cargo);
    }
    
    public void cadastrarHabilitacao(String categoria) throws SQLException, ClassNotFoundException, SBPRException{
        
        Habilitacao habilitacao = new Habilitacao(categoria);
        gdGeral.cadastrar(habilitacao);
    }
    
    public List<Cargo> consultarCargos(){
       return gdGeral.consultar(Cargo.class);
    }
    
    public List<Habilitacao> consultarHabilitacoes(){
       return gdGeral.consultar(Habilitacao.class);
    }
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        new WebServiceEmail(emailDestinatario, mensagem, telefone);
    }
    
    public void inciarBancoDeDados(){ 
         config = new Config();
    }
    
    public boolean validarAcesso(String usuario, String senha){ 
       return gdGeral.validarAcesso(usuario, senha);    
    }
    
     public Cep consultarCep(String cep){
        return gdEndereco.consultarCep(cep);
    }
}
