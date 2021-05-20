package com.springboot.clientapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.clientapp.models.entity.Departamento;
import com.springboot.clientapp.models.entity.Empleado;
import com.springboot.clientapp.models.entity.Puesto;
import com.springboot.clientapp.models.service.IDepartamentoService;
import com.springboot.clientapp.models.service.IEmpleadoService;
import com.springboot.clientapp.models.service.IPuestoService;

@Controller
@RequestMapping("/views/empleados")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService EmpleadoService;
	@Autowired
	private IDepartamentoService DepartamentoService;
	@Autowired
	private IPuestoService PuestoService;
	@GetMapping("/")
	public String listarEmpleados(Model model) {
		
		List<Empleado> listadoEmpleados=EmpleadoService.listarTodos();
		model.addAttribute("titulo","Lista");
		model.addAttribute("empleados", listadoEmpleados);
		return "/views/empleados/listar";
	}
	@GetMapping("/agregar")
	public String agregar(Model model) {
		Empleado empleado = new Empleado();
		List<Departamento>listDepartamento=DepartamentoService.ListaDepartamento();
		List<Puesto>listPuesto=PuestoService.ListaPuesto();
		model.addAttribute("empleado",empleado);
		model.addAttribute("departamentos",listDepartamento);
		model.addAttribute("puesto",listPuesto);
		return "/views/empleados/agregar";
	}
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") Long id_empleado, Model model) {
		Empleado empleado = EmpleadoService.buscarPorId(id_empleado);
		List<Departamento>listDepartamento=DepartamentoService.ListaDepartamento();
		List<Puesto>listPuesto=PuestoService.ListaPuesto();
		model.addAttribute("empleado",empleado);
		model.addAttribute("departamentos",listDepartamento);
		model.addAttribute("puesto",listPuesto);
		return "/views/empleados/agregar";
	}
	@PostMapping("/save")
	public String guardar(@ModelAttribute Empleado empleado) {
		
		EmpleadoService.guardar(empleado);
	
		return "redirect:/views/empleados/";
	}

	
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id_empleado) {
		EmpleadoService.eliminar(id_empleado);


		
		return "redirect:/views/empleados/";
	}
}
