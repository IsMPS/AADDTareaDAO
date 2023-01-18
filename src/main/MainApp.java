package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import main.model.Empleado;

public class MainApp {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();

		// Abro sesion
		Session session = sf.openSession();

		// Inicio transaccion
		session.getTransaction().begin();

		
		
		Empleado usuarioPrueba = new Empleado();
		
		usuarioPrueba.setUsername("U");
		usuarioPrueba.setPassword("U");
		session.save(usuarioPrueba);
		
		

		// Commit transaccion
		session.getTransaction().commit();

		// Cierra Session y SessionFactory
		session.close();
		sf.close();
	}

}
