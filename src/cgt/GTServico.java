package cgt;

import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.TipoServico;
import cgd.GDServico;
import java.sql.SQLException;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GTServico {
    
    private GDServico gdServico;

    public GTServico() {
        gdServico = new GDServico();
    }
    
    public ServicoAgendado cadastrarServico(Produtor produtor, Propriedade propriedade, 
            TipoServico tipoServico, String dtPrevistaConclusao,
            String qtdHrsPrevista) throws Exception {
        
        ServicoAgendado servicoAgendado = new ServicoAgendado();
        servicoAgendado.setProdutor(produtor);
        servicoAgendado.setPropriedade(propriedade);
        servicoAgendado.setTipoServico(tipoServico);
        servicoAgendado.setData_agendamento(Calendar.getInstance().getTime());
        servicoAgendado.setData_prevista_conclusao(new Date(dtPrevistaConclusao));
        servicoAgendado.setQtd_hrs_prevista(Double.parseDouble(qtdHrsPrevista));
        
        try {
            gdServico.cadastrar(servicoAgendado);
            return servicoAgendado;
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void alterarServico(Servico servico, Produtor produtor, Propriedade propriedade, 
                TipoServico tipoServico, String dtPrevistaConclusao, 
                String qtdHrsPrevista) throws SQLException, ClassNotFoundException{
        
        servico.setData_prevista_conclusao(new Date(dtPrevistaConclusao));
        servico.setQtd_hrs_prevista(Double.parseDouble(qtdHrsPrevista));
        servico.setProdutor(produtor);
        servico.setPropriedade(propriedade);
        servico.setTipoServico(tipoServico);
        
        gdServico.alterar(servico);
    }
    
    public int consultarServico(){
        //gdServico.consultar();
        return 0;
    }
    
    public int cancelarServico(){
        //gdServico.cancelar();
        return 0;
    } 
    
    public int concluirServico(){
        //gdServico.concluir();
        return 0;
    } 
    
    public List<Servico> filtrarServicoTipo(int tipoServico_id) {
        return gdServico.filtrarTipo(tipoServico_id);
    }
    
    public List<Servico> filtrarServico(int produtor_id, int propriedade_id) {
        return gdServico.filtrar(produtor_id, propriedade_id);
    }
}
