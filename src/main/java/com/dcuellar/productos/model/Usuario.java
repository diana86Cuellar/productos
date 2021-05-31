package com.dcuellar.productos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Modelo: Usuario.java 
 * 
 * Esta Clase tiene relacion uno a muchos con Cargo 
 * Es decir, un usuario solo podra tener un solo cargo 
 * y un cargo podra ser ocupado por muchos usuarios
 * 
 * Id se genera automaticamente 
 * se espera como identificacion el numero de identificaion de la persona
 * @author Diana
 *
 */

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long 		id;
	private int 		documento; 
	private String 		nombre_usuario;
	private int 		edad; 
	
	@ManyToOne
	@JoinColumn(name = "id_cargo")
	private Cargo cargo;

	
	public Usuario() {
		
	}


	public Usuario(int documento, String nombre_usuario, int edad, Cargo cargo) {
		super();
		this.documento = documento;
		this.nombre_usuario = nombre_usuario;
		this.edad = edad;
		this.cargo = cargo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public String getNombre_usuario() {
		return nombre_usuario;
	}


	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}
