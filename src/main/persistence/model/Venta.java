package main.persistence.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Venta;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Empleado empleado;
	
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
		
		@Column
		private boolean propuesta;

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
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

	public int getId_Venta() {
		return id_Venta;
	}

	public Venta() {
		super();
	}
	
	public Date getFecha_Validez() {
		return fecha_Validez;
	}

	public void setFecha_Validez(Date fecha_Validez) {
		this.fecha_Validez = fecha_Validez;
	}

	public boolean isPropuesta() {
		return propuesta;
	}

	public void setPropuesta(boolean propuesta) {
		this.propuesta = propuesta;
	}
	
	
	
	
}
