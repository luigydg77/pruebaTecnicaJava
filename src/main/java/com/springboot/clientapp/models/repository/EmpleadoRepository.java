package com.springboot.clientapp.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.clientapp.models.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

	
	
}
