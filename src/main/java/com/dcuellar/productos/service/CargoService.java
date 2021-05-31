package com.dcuellar.productos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dcuellar.productos.model.Cargo;
import com.dcuellar.productos.repository.CargoRepository;

/**
 * En las clases servicios se implementan los metodos que se han declarado
 * en las interfaces de repository
 * 
 * service: CargoService
 * repository relacionado: CargoRepository
 * 
 * Los cargos se van a guardar mediante la BD  
 * no se considera necesario implementar todos los metodos, unicamente el de listar todos y guardar por objeto (para usarse a futuro) 
 * 
 * @author Diana
 *
 */

@Service
public class CargoService implements CargoRepository {
	
	@Autowired
	private CargoRepository cargoRepository;

	@Override
	public List<Cargo> findAll() {
		return cargoRepository.findAll();
	}
	
	@Override
	public <S extends Cargo> S save(S entity) {
		return cargoRepository.save(entity);
	}
	
	@Override
	public List<Cargo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cargo> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cargo> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cargo> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cargo> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Cargo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cargo getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cargo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cargo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cargo> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cargo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Optional<Cargo> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cargo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cargo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cargo> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cargo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cargo> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cargo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	} 

}
