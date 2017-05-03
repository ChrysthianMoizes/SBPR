package cci;

import cci.util.Constante;
import cdp.Propriedade;
import cgt.GTPropriedade;
import javax.swing.JFrame;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CIPropriedade {
    
    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;

    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }
    
    public void gerenciarPropriedade(int codCrud, JFrame pai) {
        
        JDCadastroPropriedade cadastroPropriedade;
        JDPesquisaPropriedade pesquisaPropriedade;
        
        if (codCrud == Constante.CADASTRAR) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface);
            cadastroPropriedade.setVisible(true);
        } else if (codCrud == Constante.ALTERAR) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == Constante.CONSULTAR) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == Constante.EXCLUIR) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface);
            pesquisaPropriedade.setVisible(true);
        }

    }
    
    public void gerenciarPropriedade(JFrame pai, String responsavel) {
        
        JDCadastroPropriedade cadastroPropriedade;
        
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, responsavel);
            cadastroPropriedade.setVisible(true);
    }
        
    public boolean cadastrarPropriedade(String responsavel, String nome, String referencia){
        
        try{   
          gtPropriedade.cadastrarPropriedade(responsavel, nome, referencia);
          JOptionPane.showMessageDialog(null, "Cadastrada com sucesso!");
          return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }    
    }
    
    public void alterarPropriedade(){
        int i = gtPropriedade.alterarPropriedade();
    }
    
    public void consultarPropriedade(){
        int i = gtPropriedade.consultarPropriedade();
    }
    
    public void excluirPropriedade(){
        int i = gtPropriedade.excluirPropriedade();
        JOptionPane.showMessageDialog(null, "Propriedade excluída com sucesso");
    }
    
    public LinkedList<Propriedade> filtroProdutores(String colunaFiltro, String filtro) {
        return gtPropriedade.filtrarProdutores(colunaFiltro, filtro);
    }
}
