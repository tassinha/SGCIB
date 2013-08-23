package sgcib.daos;

import sgcib.beans.Atleta;
import sgcib.hibernate.DaoGenerico;

public class AtletaDao extends DaoGenerico<Atleta> {

    public AtletaDao() {
        super();
    }

    public AtletaDao(Atleta atleta) {
        super(atleta);
    }    
}
