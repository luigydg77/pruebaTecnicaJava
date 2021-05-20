package com.springboot.clientapp.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.clientapp.models.entity.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {

}
