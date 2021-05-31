package com.dcuellar.productos.dto;

public class MensajeUsuario {
	
	private String mensaje; 
	
	
	public MensajeUsuario(String mensaje) {
		super();
		this.mensaje = mensaje;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
