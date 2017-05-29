package cci;

import cci.util.Cenario;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.ServicoAgendado;
import cdp.TipoServico;
import cgt.GTServico;
import cih.servico.JDCadastroServico;
import cih.servico.JDPesquisaServico;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CIServico {
    
    private CIInterface ciInterface;
    private GTServico gtServico;
    private JDCadastroServico agendarServico;
    private JDPesquisaServico consultarServico;

    public CIServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtServico = new GTServico();
    }
    
     public void gerenciarServico(int CENARIO, JFrame pai) {

        switch (CENARIO) {
            case Cenario.AGENDAR:
                agendarServico = new JDCadastroServico(pai, true, ciInterface, Cenario.AGENDAR);
                agendarServico.setVisible(true);
                break;
            default:
                consultarServico = new JDPesquisaServico(pai, true, ciInterface);
                consultarServico.setVisible(true);
                break;
        }
    }
     
     public ServicoAgendado cadastrarServico(Produtor produtor, Propriedade propriedade, 
             TipoServico tipoServico, String dtPrevistaConclusao, String qtdHrsPrevista) {
         try {
             return gtServico.cadastrarServico(produtor, propriedade, tipoServico, dtPrevistaConclusao, qtdHrsPrevista);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(agendarServico, "Não foi possível agendar o serviço: "+e.getMessage());
             return null;
         }
     }
     
     public void alterarServico(){
         int i = gtServico.alterarServico();
     }
     
     public void consultarServico(){
         int i = gtServico.consultarServico();
     }
     
     public void cancelarServico(){
         int i = gtServico.cancelarServico();
     }
     
     public void concluirServico(){
         int i = gtServico.concluirServico();
     }
    
}
