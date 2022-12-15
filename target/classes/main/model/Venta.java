package main.model;

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
	private User empleado;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Cliente cliente;
	
	@Column
	private double precio;

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

	public int getId_Venta() {
		return id_Venta;
	}

	public Venta() {
		super();
	}
	
	
	
}
