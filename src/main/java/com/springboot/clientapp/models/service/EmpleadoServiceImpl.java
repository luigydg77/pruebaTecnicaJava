package com.springboot.clientapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clientapp.models.entity.Empleado;
import com.springboot.clientapp.models.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private EmpleadoRepository EmpleadoRepository;
	
	@Override
	public List<Empleado> listarTodos() {
		
		return (List<Empleado>) EmpleadoRepository.findAll();
	}

	@Override
	public void guardar(Empleado empleado) {
		EmpleadoRepository.save(empleado);

	}

	@Override
	public Empleado buscarPorId(Long id_empleado) {
		
		return EmpleadoRepository.findById(id_empleado).orElse(null);
	}

	@Override
	public void eliminar(Long id_empleado) {
		EmpleadoRepository.deleteById(id_empleado);

	}

}
