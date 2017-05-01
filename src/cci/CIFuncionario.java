package cci;

import cci.util.Constante;
import cgt.GTFuncionario;
import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;

public class CIFuncionario {
    
    private CIInterface ciInterface;
    private GTFuncionario gtFuncionario;

    public CIFuncionario(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtFuncionario = new GTFuncionario();
    }
    
    public void gerenciarFuncionario(int codCrud, JFrame pai) {
        
        JDCadastroFuncionario cadastroFuncionario;
        JDPesquisaFuncionario pesquisaFuncionario;

        if (codCrud == Constante.CADASTRAR) {
            cadastroFuncionario = new JDCadastroFuncionario(pai, true, ciInterface);
            cadastroFuncionario.setVisible(true);
        } else if (codCrud > Constante.ALTERAR) {
            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, ciInterface);
            pesquisaFuncionario.setVisible(true);
        }else if (codCrud == Constante.CONSULTAR) {
            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, ciInterface);
            pesquisaFuncionario.setVisible(true);
        } else if (codCrud == Constante.EXCLUIR) {
           pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, ciInterface);
            pesquisaFuncionario.setVisible(true);
        }
    }
    
    public void cadastrarFuncionario(){
        int i = gtFuncionario.cadastrarFuncionario();
    }
    
    public void alterarFuncionario(){
        int i = gtFuncionario.alterarFuncionario();
    }
    
    public void consultarFuncionario(){
        int i = gtFuncionario.consultarFuncionario();
    }
    
    public void excluirFuncionario(){
        int i = gtFuncionario.excluirFuncionario();
    }
    
}
