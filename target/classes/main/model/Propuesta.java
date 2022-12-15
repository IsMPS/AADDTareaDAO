package main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Propuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Propuesta;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User empleado;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Cliente cliente;
	
	@Column
	private double precio;
	
	// Comprobar en la app que es más tarde que la fecha actual.
	@Column
	private Date fecha_Validez;

	public Propuesta() {
		super();
	}

	public int getId_Propuesta() {
		return id_Propuesta;
	}

	public User getEmpleado() {
		return empleado;
	}

	public void setEmpleado(User empleado) {
		this.empleado = empleado;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha_Validez() {
		return fecha_Validez;
	}

	public void setFecha_Validez(Date fecha_Validez) {
		this.fecha_Validez = fecha_Validez;
	}
	
	

}
