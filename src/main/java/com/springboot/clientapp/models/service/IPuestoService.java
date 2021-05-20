package com.springboot.clientapp.models.service;

import java.util.List;

import com.springboot.clientapp.models.entity.Departamento;
import com.springboot.clientapp.models.entity.Empleado;
import com.springboot.clientapp.models.entity.Puesto;

public interface IPuestoService {
	List<Puesto>ListaPuesto();
	public void guardar(Puesto nombre_puesto);
	public Puesto buscarPorId(Long id_puesto);
	public void eliminar(Long id_puesto);
}
