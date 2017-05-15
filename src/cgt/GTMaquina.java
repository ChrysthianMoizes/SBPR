package cgt;

import cdp.Maquina;
import cgd.GDMaquina;
import java.sql.SQLException;

public class GTMaquina {
    
    private GDMaquina gdMaquina;

    public GTMaquina() {
        gdMaquina = new GDMaquina();
    }
    
    public int cadastrarMaquina(Maquina maquina) throws SQLException, ClassNotFoundException{
        gdMaquina.cadastrar(maquina);
        return 0;
    }
    
    public void alterarMaquina(Maquina maquina) throws SQLException, ClassNotFoundException{
        gdMaquina.alterar(maquina);
    }
    
    public int consultarMaquina(Maquina maquina){
        gdMaquina.consultar(maquina);
        return 0;
    }
    
    public int excluirMaquina(Maquina maquina) throws SQLException, ClassNotFoundException{
        gdMaquina.excluir(maquina);
        return 0;
    } 
}
