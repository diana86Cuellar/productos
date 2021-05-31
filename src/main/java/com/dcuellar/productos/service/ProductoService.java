package com.dcuellar.productos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcuellar.productos.model.Producto;
import com.dcuellar.productos.repository.ProductoRepository;

/**
 * En las clases servicios se implementan los metodos que se han declarado
 * en las interfaces de repository
 * 
 * service: ProductoService
 * repository relacionado: ProductoService
 * @author Diana
 *
 */

@Service
public class ProductoService implements ProductoRepository {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	/*@Override
	public Optional<Producto> findByNombre(String nombre) {
		return productoRepository.findByNombre(nombre);
	}

	@Override
	public boolean existsByNombre(String nombre) {
		return productoRepository.existsByNombre(nombre);
	} */
	
	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}
	
	@Override
	public Producto getOne(Long id) {
		return productoRepository.getById(id);
	}
	
	
	@Override
	public Producto getById(Long id) {
		return productoRepository.getById(id);
	}
	
	
	@Override
	public List<Producto> findAllById(Iterable<Long> ids) {
		return productoRepository.findAllById(ids);
	}
	
	@Override
	public List<Producto> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Producto> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Producto> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	
	

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Producto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Optional<Producto> findById(Long id) {
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
	public void delete(Producto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Producto> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Producto> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Producto> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Producto> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}




	

}
