package cgt;

import cdp.Produtor;
import cdp.Servico;
import cgd.GDProdutor;
import cgd.GDServico;
import cgt.util.*;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.util.List;

public class GTProdutor {

    private GDProdutor gdProdutor;
    private GDServico gdServico;

    public GTProdutor() {
        gdProdutor = new GDProdutor();
        gdServico = new GDServico();
    }
    
    public Produtor instanciarProdutorVazio(){    
        Produtor produtor = new Produtor();
        return produtor;     
    }
    
    public Produtor cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
            
        validarCampos(nome, cpf, data_nasc, rg, telefone, inscricao);
        
        Date data = Uteis.formatarData("dd/MM/yyyy", data_nasc);
        
        Produtor produtor = new Produtor(nome, cpf, data, inscricao, rg, telefone, sexo);
        gdProdutor.cadastrar(produtor);
        
        return produtor;

    }

    public void alterarProdutor(Produtor produtor, String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone, inscricao);
        
        Date data = Uteis.formatarData("dd/MM/yyyy", data_nasc);
        
        produtor.setCpf(cpf);
        produtor.setDt_nasc(data);
        produtor.setInscricao_estadual(inscricao);
        produtor.setNome(nome);
        produtor.setRg(rg);
        produtor.setSexo(sexo);
        produtor.setTelefone(telefone);
        
        gdProdutor.alterar(produtor);
    }

    public List<Produtor> filtrarProdutor(String colunaFiltro, String valorFiltro) {
        return gdProdutor.filtrar(colunaFiltro, valorFiltro);
    }

    public void excluirProdutor(Produtor produtor) throws SQLException, ClassNotFoundException, SBPRException {
        
        List servicos = gdServico.filtrar("produtor.id", produtor.getId(), Servico.class);
        if ( servicos.isEmpty() )
        gdProdutor.excluir(produtor);
        else 
            throw new SBPRException(54);
    }

    private void validarCampos(String nome, String cpf, String data, String rg, String telefone, String inscricao) throws Exception {
        
        if(!ValidaCampos.validarNome(nome))
            throw new SBPRException(1);
        if(!ValidaCampos.validarCpf(cpf))
            throw new SBPRException(2);
        if(!ValidaCampos.validarDataNasc(data))
            throw new SBPRException(3);
        if(!ValidaCampos.validarRg(rg))
            throw new SBPRException(4);
        if(!ValidaCampos.validarTelefone(telefone))
            throw new SBPRException(5);
        if(!ValidaCampos.validarInscricaoEstadual(inscricao))
            throw new SBPRException(6);
    }
}
