package com.dcuellar.productos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcuellar.productos.model.Usuario;
import com.dcuellar.productos.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioREST {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuario(){
		return ResponseEntity.ok(usuarioService.findAll());
		
	}
	
	@GetMapping("{id}")
	private ResponseEntity<List<Usuario>> getAllUsuarioByIdCargo(@PathVariable("id") Long idCargo){
		return ResponseEntity.ok(usuarioService.findAllByIdCargo(idCargo));
	}

}
