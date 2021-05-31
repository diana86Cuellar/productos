package com.dcuellar.productos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcuellar.productos.model.Producto;
import com.dcuellar.productos.service.ProductoService;

@RestController
@RequestMapping("/producto/")
public class ProductoREST {
	
	@Autowired
	private ProductoService productoService; 
	
	@GetMapping
	private ResponseEntity<List<Producto>> getAllProducto(){
		return ResponseEntity.ok(productoService.findAll());
		
	}
	
	/*@GetMapping("listar/{nombre}")
	private ResponseEntity<Producto> getByNombre(@PathVariable("nombre") String asNombre){		
		return ResponseEntity.ok(productoService.findByNombre(asNombre).get()); 
	}*/

}
