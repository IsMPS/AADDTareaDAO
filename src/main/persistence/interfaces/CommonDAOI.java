package main.persistence.interfaces;

import java.util.List;

public interface CommonDAOI<T> {
	
	public void insert(final T paramT);

	
	public void update(final T paramT);

	
	public void delete(final T paramT);

	
	public T searchById(final int id);

	public List<T> searchAll();

}
