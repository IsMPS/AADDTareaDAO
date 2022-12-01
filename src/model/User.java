package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import utils.TipoUsers;
import utils.TipoVehiculos;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Enumerated(EnumType.STRING)
	private TipoUsers tipoUser;
	
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
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoUsers getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(TipoUsers tipoUser) {
		this.tipoUser = tipoUser;
	}
	
	
	
}
