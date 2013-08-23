package sgcib.daos;

import sgcib.beans.Usuario;
import sgcib.hibernate.DaoGenerico;

public class UsuarioDao extends DaoGenerico<Usuario> {

    public UsuarioDao() {
        super();
    }

    public UsuarioDao(Usuario usuario) {
        super(usuario);
    }
}
