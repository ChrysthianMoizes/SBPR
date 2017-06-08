package cgd;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class GDServico extends GDGenerico {
    
    private void persistir(Object servicoAgendado, Object novoServico){
        
        Session sessao = criarSessao();
        Transaction tx = sessao.beginTransaction();
        
        try {
            
            sessao.delete(servicoAgendado);
            sessao.save(novoServico);
            
            sessao.flush();
            tx.commit();
            
        } catch (Exception e) {    
            tx.rollback();

        }finally{
            sessao.clear();
            sessao.close();
        }        
    }
    
    public void cancelarServico(Object servicoAgendado, Object servicoCancelado) {
        persistir(servicoAgendado, servicoCancelado);
    }
     
    public void concluirServico(Object servicoAgendado, Object servicoConcluido){
        persistir(servicoAgendado, servicoConcluido);
    }
         
    public List filtrar(String coluna, int id, Class classe) {
        Criteria crit = criarSessao().createCriteria(classe);
        crit.add(Restrictions.eq(coluna, id));
        List listaServico =  crit.list();
        sessao.close();
        return listaServico;
    }
}
