package com.springboot.clientapp.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.clientapp.models.entity.Puesto;
@Repository
public interface PuestoRepository extends CrudRepository<Puesto, Long> {

	
	
}
