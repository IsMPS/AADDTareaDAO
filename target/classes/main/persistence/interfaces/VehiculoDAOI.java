package main.persistence.interfaces;

import main.persistence.model.*;

public interface VehiculoDAOI extends CommonDAOI<Vehiculo> {

	public int searchIdByMatricula(String matricula);
	
	public Vehiculo searchByMatricula(String matricula);
}
