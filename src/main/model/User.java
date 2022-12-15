package main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import main.utils.TipoUsers;
import main.utils.TipoVehiculos;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_User;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String telefono;
	
	@Column
	private String dni;
	
	@Column
	private String cod_Postal;
	
	@Column
	private String direccion;
	
	@Column
	private Date fecha_Nac;
	
	@Column
	private double sueldo;
	
	@Column
	private Date fecha_Inicio;
	
	@Column
	private String horario;
	
	// Bloquear el generar empleados JEFES
	@Enumerated(EnumType.STRING)
	private TipoUsers puesto;
	
	@Enumerated(EnumType.STRING)
	private TipoVehiculos especializacion;
	
	// Tipo especializacion para user mecanico
	
	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id_User;
	}

	public TipoUsers getPuesto() {
		return puesto;
	}

	public void setPuesto(TipoUsers tipoUser) {
		this.puesto = tipoUser;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCod_Postal() {
		return cod_Postal;
	}

	public void setCod_Postal(String cod_Postal) {
		this.cod_Postal = cod_Postal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFecha_Nac() {
		return fecha_Nac;
	}

	public void setFecha_Nac(Date fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFecha_Inicio() {
		return fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public TipoVehiculos getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(TipoVehiculos especializacion) {
		this.especializacion = especializacion;
	}
	
	
	
}
