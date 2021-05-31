package com.dcuellar.productos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcuellar.productos.model.Cargo;
import com.dcuellar.productos.service.CargoService;


/**
 * Debemos de importar para esta clase la correspondiente al servicio
 * ya que la clase servico es la que contiene nuesros metodos 
 * 
 * 
 * serviceRelacionado: CargoService
 * @author Diana
 *
 */

@RestController
@RequestMapping("/cargo/")
public class CargoREST {
	
	@Autowired
	private CargoService cargoService; 
	
	@GetMapping
	private ResponseEntity<List<Cargo>> getAllCargo(){		
		return ResponseEntity.ok(cargoService.findAll());
		
	}

}
