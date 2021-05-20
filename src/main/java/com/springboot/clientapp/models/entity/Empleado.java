package com.springboot.clientapp.models.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleado" , schema = "empleados")
public class Empleado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_empleado;
	private String nombres;
	private String apellidos;
	private String sexo;
	private double salario;
	private String fecha_nacimiento;
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Departamento departamento;
	@ManyToOne
	@JoinColumn(name="id_puesto")
	private Puesto puesto;
	public Long getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(Long id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Puesto getPuesto() {
		return puesto;
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", nombres=" + nombres + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ",fecha_nacimiento="+ fecha_nacimiento +", departamento=" + departamento + ", puesto=" + puesto + "]";
	}
	
}
