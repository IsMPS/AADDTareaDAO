package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import main.persistence.dao.CommonDAOImpl;
import main.persistence.interfaces.CommonDAOI;
import main.persistence.model.Empleado;

public class MainApp {

	public static void main(String[] args) {
		
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();

		// Abro sesion
		Session session = sf.openSession();

		// Inicio transaccion
		session.getTransaction().begin();

		
		
		Empleado usuarioPrueba = new Empleado();	
		usuarioPrueba.setApellidos("Piulestan");

		CommonDAOI<Empleado> CDAOImpl =  new CommonDAOImpl<Empleado>(session);
		CDAOImpl.insert(usuarioPrueba);
		

		// Cierra Session y SessionFactory
		session.close();
		sf.close();
	}

}
