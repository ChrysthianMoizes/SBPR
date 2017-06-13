package cgd;

import cdp.Produtor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDProdutor extends GDGenerico {
       
    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Produtor.class);
        colunaFiltro = colunaFiltro.toLowerCase();
        crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}