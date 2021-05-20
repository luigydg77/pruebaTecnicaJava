package com.springboot.clientapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clientapp.models.entity.Departamento;
import com.springboot.clientapp.models.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Override
	public List<Departamento> ListaDepartamento() {
		
		return (List<Departamento>) departamentoRepository.findAll();
	}

}
