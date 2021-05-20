package com.springboot.clientapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="puesto")
public class Puesto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_puesto;
	private String nombre_puesto;
	public Long getId_puesto() {
		return id_puesto;
	}
	public void setId_puesto(Long id_puesto) {
		this.id_puesto = id_puesto;
	}
	public String getPuesto() {
		return nombre_puesto;
	}
	public void setPuesto(String nombre_puesto) {
		this.nombre_puesto = nombre_puesto;
	}
	@Override
	public String toString() {
		return "Puesto [id_puesto=" + id_puesto + ", nombre_puesto=" + nombre_puesto + "]";
	}
	
}
