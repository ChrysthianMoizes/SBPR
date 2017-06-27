package cci.relatorio;

import cgt.util.SBPRException;
import net.sf.jasperreports.engine.JRException;
import java.util.List;

public class CRMaquina extends CRGenerico {
    
    public void listagem(List lista) {
        try {
            gerarRelatorio("../../cih/maquina/JRListaMaquina.jasper", lista);
        } catch (JRException ex) {
            System.out.println( ex.getMessage() );
        } catch (SBPRException ex) {
            System.out.println( ex.getMessage() );
        }
    }
}
