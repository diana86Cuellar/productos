package com.dcuellar.productos.dto;

import java.util.Date;

import com.sun.istack.NotNull;

public class ProductoDTO {
	
	@NotNull
	private String 	nombre_producto;
	
	@NotNull
	private int 	cantidad; 
	
	@NotNull
	private Date 	fechaingreso;
	
	
	public ProductoDTO() {
		
	}

	public ProductoDTO(String nombre_producto, int cantidad, Date fechaingreso) {
		super();
		this.nombre_producto = nombre_producto;
		this.cantidad = cantidad;
		this.fechaingreso = fechaingreso;
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
	
	

}
