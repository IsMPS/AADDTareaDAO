package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Reparacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String color;
	
	@Column
	private int horas_Estimadas;
	
	@Column
	private String listado_Piezas;
	
	@Column
	private boolean iniciado;
	
	// Iniciar y luego comprobar si tiene fecha de finalizacion par saber si ha terminado o añadir un boolean para terminar
	
	@Column
	private Date fecha_Finalizacion;
	
	@PrimaryKeyJoinColumn
	private User empleado;
}
