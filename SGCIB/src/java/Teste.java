
import sgcib.beans.Atleta;
import sgcib.beans.Categoria;
import sgcib.beans.Clube;
import sgcib.beans.Usuario;
import sgcib.daos.AtletaDao;
import sgcib.daos.CategoriaDao;
import sgcib.daos.ClubeDao;
import sgcib.daos.UsuarioDao;
import sgcib.hibernate.HibernateManager;

public class Teste {
    public static void main(String[] args) {
//        HibernateManager.criarTabelas();
        
        Categoria categoria1 = new Categoria();
        categoria1.setNome("Pré-Mirim");
        
        new CategoriaDao(categoria1).persist();
        
        Clube clube = new Clube();
        clube.setNome("Sonibram");
        
        new ClubeDao(clube).persist();
        
        Atleta atleta1 = new Atleta();
        atleta1.setNome("Tassia");
        atleta1.setClube(clube);
        atleta1.setCategoria(categoria1);
        
        new AtletaDao(atleta1).persist();
        
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Paulo");
        
        new UsuarioDao(usuario1).persist();
        
    }
}
