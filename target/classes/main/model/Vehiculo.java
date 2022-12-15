package main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import main.utils.TipoVehiculos;

@Entity
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Vehiculo;
	
	@Column
	private String matricula;
	
	@Column
	private String color;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	// Interesa vender los vehiculos más antiguos
	@Column
	private Date Fecha_Entrada;
	
	@Enumerated(EnumType.STRING)
	private TipoVehiculos tipoVehiculo;
	
	// Casilla para ocultar desocultar los vehiculos de los demás concesionarios
	@OneToOne
	@PrimaryKeyJoinColumn
	private Concesionario concesionario; 
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Cliente cliente;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFecha_Entrada() {
		return Fecha_Entrada;
	}

	public void setFecha_Entrada(Date fecha_Entrada) {
		Fecha_Entrada = fecha_Entrada;
	}

	public TipoVehiculos getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculos tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId_Vehiculo() {
		return id_Vehiculo;
	}

	public Vehiculo() {
		super();
	} 
	
	
	
	
}
