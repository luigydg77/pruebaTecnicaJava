

package com.springboot.clientapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_departamento;
	private String nombre_departamento;
	public Long getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(Long id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getNombre_departamento() {
		return nombre_departamento;
	}
	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}
	@Override
	public String toString() {
		return "Departamento [id_departamento=" + id_departamento + ", nombre_departamento=" + nombre_departamento
				+ "]";
	}

	
}