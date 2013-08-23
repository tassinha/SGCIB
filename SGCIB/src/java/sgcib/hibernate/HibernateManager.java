package sgcib.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import sgcib.beans.Atleta;
import sgcib.beans.Categoria;
import sgcib.beans.Clube;
import sgcib.beans.Usuario;

public class HibernateManager {

    private static AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
    private static SessionFactory factory;

    static {
        mapear();
       HibernateManager.annotationConfiguration.setProperty("hibernate.current_session_context_class","thread");
    }

    public static void criarTabelas() {
        new SchemaExport(annotationConfiguration).create(true, true);
    }

    public static void addClass(Class classe) {
        annotationConfiguration.addAnnotatedClass(classe);
    }

    public static void excluirTabelas() {
        new SchemaExport(annotationConfiguration).drop(true, true);
    }

    public static void mapear() {
        
      addClass(Atleta.class);
      addClass(Categoria.class);
      addClass(Clube.class);
      addClass(Usuario.class);

    }

    public static Session getSessao() {
        factory = annotationConfiguration.buildSessionFactory();
        Session sessao = factory.openSession();
        factory.close();
        return sessao;
    }
    public static SessionFactory getSessionFactory(){
        return annotationConfiguration.buildSessionFactory();
    }
}
