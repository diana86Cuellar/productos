package com.dcuellar.productos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo: Cargo.java
 * 
 * @author Diana
 *
 */

@Entity
@Table(name="cargo")
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre_cargo;
	
	
	public Cargo() {
		
	}


	public Cargo(Long id, String nombre_cargo) {
		super();
		this.id = id;
		this.nombre_cargo = nombre_cargo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_cargo() {
		return nombre_cargo;
	}


	public void setNombre_cargo(String nombre_cargo) {
		this.nombre_cargo = nombre_cargo;
	}
	
	
	
	

}
