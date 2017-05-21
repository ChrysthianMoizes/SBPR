package cgd;

import cdp.Produtor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDProdutor extends GDGenerico {
       
    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Produtor.class);
        //crit.setMaxResults(50);
        List listaProdutores = crit
                .add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") )
                .list();
        sessao.close();
        return listaProdutores;
    }
}