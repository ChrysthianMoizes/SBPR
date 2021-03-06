package cci;

import cdp.Produtor;
import cdp.Propriedade;
import cgt.GTPropriedade;
import cci.util.Cenario;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import java.awt.Frame;
import javax.swing.JFrame;
import java.util.List;

public class CIPropriedade {

    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;
    private JDCadastroPropriedade cadastroPropriedade;
    private JDPesquisaPropriedade pesquisaPropriedade;

    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }

    public void gerenciarPropriedade(int CENARIO, JFrame pai) {

        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroPropriedade(null, pai, CENARIO);
        else
            instanciarTelaFiltroPropriedade(pai, CENARIO);
    }

    public void instanciarTelaCadastroPropriedade(Propriedade propriedade, Frame pai, int CENARIO) {
        cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, CENARIO, propriedade);
        cadastroPropriedade.setVisible(true);
    }

    public void instanciarTelaFiltroPropriedade(Frame pai, int CENARIO) {
        pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface, CENARIO);
        pesquisaPropriedade.setVisible(true);
    }

    public void cadastrarPropriedade(Produtor responsavel, String nome, String referencia, String mensagem)  {
        try {
            gtPropriedade.cadastrarPropriedade(responsavel, nome, referencia); 
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroPropriedade, mensagem);
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroPropriedade, e.getMessage());
        }
    }

    public Propriedade instanciarPropriedadeVazia(Produtor produtor) {
        return gtPropriedade.instanciarPropriedadeVazia(produtor);
    }

    public void alterarPropriedade(Propriedade propriedade, Produtor produtorSelecionado){
        try {
            gtPropriedade.alterarPropriedade(propriedade, produtorSelecionado);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroPropriedade, "Alterada com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroPropriedade, e.getMessage());
        }
    }

    public void excluirPropriedade(Propriedade propriedade){
        try {
            gtPropriedade.excluirPropriedade(propriedade);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroPropriedade, "Excluída com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroPropriedade, e.getMessage());
        }
    }

    public List<Propriedade> filtrarPropriedades(String colunaFiltro, String filtro) {
        return gtPropriedade.filtrarPropriedades(colunaFiltro, filtro);
    }
}