package sgcib.daos;

import sgcib.beans.Categoria;
import sgcib.hibernate.DaoGenerico;

public class CategoriaDao extends DaoGenerico<Categoria> {

    public CategoriaDao() {
        super();
    }

    public CategoriaDao(Categoria categoria) {
        super(categoria);
    }    
}
