package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Concesionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Concesionario;
	
	@Column
	private String nombre_Concesionario;
	
	@Column
	private String pais;

	public String getNombre_Concesionario() {
		return nombre_Concesionario;
	}

	public void setNombre_Concesionario(String nombre_Concesionario) {
		this.nombre_Concesionario = nombre_Concesionario;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getId_Concesionario() {
		return id_Concesionario;
	}

	public Concesionario() {
		super();
	}
	
	
	
}
