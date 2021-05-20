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
@RequestMapping("/views/puesto")
public class PuestoController {

	@Autowired
	private IEmpleadoService EmpleadoService;
	@Autowired
	private IDepartamentoService DepartamentoService;
	@Autowired
	private IPuestoService PuestoService;

	@GetMapping("/agregar")
	public String agregar(Model model) {
		Puesto puestos = new Puesto();
		
		model.addAttribute("puestos",puestos);
		
		return "/views/puesto/agregar";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Puesto nombre_puesto) {
		
		PuestoService.guardar(nombre_puesto);
	
		return "redirect:/views/empleados/";
	}
	
}
