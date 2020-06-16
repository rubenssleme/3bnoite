package br.com.bg.bghibernate.utilitarios;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
        //Atributo
	private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();
        
        //Metodo que retorna a Fabrica de sessoes 
	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}
        // Metodo que cria a fabricade sessoes 
	private static SessionFactory criarFabricaDeSessoes(){
		try{
			Configuration configuracao = new Configuration().configure();

			ServiceRegistry registro = new StandardServiceRegistryBuilder()
                                .applySettings(configuracao.getProperties()).build();

			SessionFactory fabrica  = configuracao.buildSessionFactory(registro);

			return fabrica;

		}catch(Throwable ex){
			System.err.println("A fabrica não foi criada" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}
