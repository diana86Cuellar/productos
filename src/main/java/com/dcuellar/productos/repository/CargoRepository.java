package com.dcuellar.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcuellar.productos.model.Cargo;

/**
 * Al tener un extends de JpaRepository
 * hereda los metodos de JpaRepository
 * Que en ultimas es tener los metodos declarados
 * 
 * @author Diana
 *
 */

public interface CargoRepository extends JpaRepository<Cargo,Long>{

}
