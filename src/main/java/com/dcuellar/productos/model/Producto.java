package com.dcuellar.productos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Medolo: Producto.java
 * tiene relacion uno a muchos con Usuario.java 
 * porque un producto solo podra ser creado y eliminado  por un solo usuario
 * pero un suario puede crear muchos productos
 * 
 * Id se genera automaticamente 
 * @author Diana
 *
 */

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long 	id;
	private String 	nombre_producto;
	private int 	cantidad; 
	private Date 	fechaingreso;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	
	public Producto() {
		
	}
	
	public Producto(String nombre_producto, int cantidad, Date fechaingreso, Usuario usuario) {
		super();
		this.nombre_producto = nombre_producto;
		this.cantidad = cantidad;
		this.fechaingreso = fechaingreso;
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
}
