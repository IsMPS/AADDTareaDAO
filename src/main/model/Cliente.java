package main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Cliente;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String DNI;
	
	@Column
	private Date fecha_Nac;

	@Column
	private String email;
	
	@Column
	private String telefono;
	
	@Column
	private String cod_Postal;
	
	@Column
	private String direccion;
	
	@Column
	private String ciudad;
	
	@Column
	private String provincia;

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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Date getFecha_Nac() {
		return fecha_Nac;
	}

	public void setFecha_Nac(Date fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public Cliente() {
		super();
	}
	
	
	
}
