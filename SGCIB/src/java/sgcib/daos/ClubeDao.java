package sgcib.daos;

import sgcib.beans.Clube;
import sgcib.hibernate.DaoGenerico;

public class ClubeDao extends DaoGenerico<Clube> {

    public ClubeDao() {
        super();
    }

    public ClubeDao(Clube clube) {
        super(clube);
    }    
}
