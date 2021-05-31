package com.dcuellar.productos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcuellar.productos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	/*Optional<Producto> findByNombre(String nombre);
	
	boolean existsByNombre(String nombre);*/

}
