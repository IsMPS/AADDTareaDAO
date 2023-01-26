package main.persistence.dao;

import java.lang.reflect.ParameterizedType; 
import java.util.List;

import org.hibernate.Session;


import main.persistence.interfaces.CommonDAOI;

public class CommonDAOImpl<T> implements CommonDAOI<T> {

	private Class<T> entityClass;

	private Session session;


	@SuppressWarnings("unchecked")
	public CommonDAOImpl(Session session) {
		
		this.session = session;
	}

	
	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	@Override
	public void insert(T paramT) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		session.save(paramT);
		
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public void update(T paramT) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		session.saveOrUpdate(paramT);
		
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public void delete(T paramT) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		session.delete(paramT);
		
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public T searchById(int id) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		return session.get(this.entityClass,id);
	}

	@Override
	public List<T> searchAll() {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		return session.createQuery("FROM "  + this.entityClass.getName()).list();
	}

}
