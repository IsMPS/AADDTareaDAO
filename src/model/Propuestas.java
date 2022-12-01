package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Propuestas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@PrimaryKeyJoinColumn
	private User empleado;
	
	@PrimaryKeyJoinColumn
	private Vehiculos vehiculo;
	
	@PrimaryKeyJoinColumn
	private Clientes cliente;
	
	@Column
	private double precio;
	
	@Column
	private Date Fecha_Validez;

}
