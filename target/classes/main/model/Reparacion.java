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
public class Reparacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Reparacion;
	
	@Column
	private String color;
	
	@Column
	private int horas_Estimadas;
	
	@Column
	private double presupuesto_Estimado;
	
	@Column
	private String listado_Piezas;
	
	@Column
	private String descripcion;
	
	// Iniciar y luego comprobar si tiene fecha de finalizacion par saber si ha terminado o añadir un boolean para terminar
	@Column
	private boolean iniciado;
	
	// Boton para confirmar la finalizacion
	@Column
	private Date fecha_Finalizacion;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Empleado empleado;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Cliente cliente;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Reparacion() {
		super();
	}

	public int getId() {
		return id_Reparacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHoras_Estimadas() {
		return horas_Estimadas;
	}

	public void setHoras_Estimadas(int horas_Estimadas) {
		this.horas_Estimadas = horas_Estimadas;
	}

	public double getPresupuesto_Estimado() {
		return presupuesto_Estimado;
	}

	public void setPresupuesto_Estimado(double presupuesto_Estimado) {
		this.presupuesto_Estimado = presupuesto_Estimado;
	}

	public String getListado_Piezas() {
		return listado_Piezas;
	}

	public void setListado_Piezas(String listado_Piezas) {
		this.listado_Piezas = listado_Piezas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isIniciado() {
		return iniciado;
	}

	public void setIniciado(boolean iniciado) {
		this.iniciado = iniciado;
	}

	public Date getFecha_Finalizacion() {
		return fecha_Finalizacion;
	}

	public void setFecha_Finalizacion(Date fecha_Finalizacion) {
		this.fecha_Finalizacion = fecha_Finalizacion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
