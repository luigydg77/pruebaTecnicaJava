package com.springboot.clientapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clientapp.models.entity.Empleado;
import com.springboot.clientapp.models.entity.Puesto;
import com.springboot.clientapp.models.repository.DepartamentoRepository;
import com.springboot.clientapp.models.repository.EmpleadoRepository;
import com.springboot.clientapp.models.repository.PuestoRepository;

@Service
public class PuestoServiceImpl implements IPuestoService {

	@Autowired
	private PuestoRepository puestoRepository;
	
	@Override
	public List<Puesto> ListaPuesto() {
		
		return (List<Puesto>) puestoRepository.findAll();
	}
	
	@Override
	public void guardar(Puesto puesto) {
		puestoRepository.save(puesto);

	}
	
	@Override
	public Puesto buscarPorId(Long id_puesto) {
		
		return puestoRepository.findById(id_puesto).orElse(null);
	}

	@Override
	public void eliminar(Long id_puesto) {
		puestoRepository.deleteById(id_puesto);

	}
	

}
