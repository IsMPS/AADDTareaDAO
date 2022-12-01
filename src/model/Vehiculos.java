package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import utils.TipoVehiculos;

@Entity
public class Vehiculos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String matricula;
	
	@Column
	private String color;
	
	@Column
	private Date Fecha_Entrada;
	
	@Enumerated(EnumType.STRING)
	private TipoVehiculos tipoVehiculo;
	
	@PrimaryKeyJoinColumn
	private Concesionario concesionario; 
	
	
}
