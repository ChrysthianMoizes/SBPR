package cgt;

import cdp.Cargo;
import cgd.Config;
import cgd.GDGeral;
import cgd.GDValidaAcesso;
import cgt.util.EnvioEmail;
import java.sql.SQLException;
import java.util.List;
import javax.mail.MessagingException;


public class GTGeral {
    
    private Config config;
    private GDGeral gdGeral;       
    private GDValidaAcesso gdValidarAcesso;

    public GTGeral() {
        gdGeral = new GDGeral();
    }

    public void cadastrarCargo(String nomeCargo) throws SQLException, ClassNotFoundException{
        
        Cargo cargo = new Cargo(nomeCargo);
        gdGeral.cadastrar(cargo);
    }
    
    public List<Cargo> consultarCargos(){
       return gdGeral.consultar(Cargo.class);
    }
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        new EnvioEmail(emailDestinatario, mensagem, telefone);
    }
    
    public void inciarBancoDeDados(){ 
         config = new Config();       
    }
    
    public boolean validarAcesso(String usuario, String senha){
        
        gdValidarAcesso = new GDValidaAcesso();
        
       return gdValidarAcesso.validarAcesso(usuario, senha);
        
    }
}
