package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity(name = "espacios")
public class Espacio implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Valid
	@ManyToMany
	private Collection<Alumno> alumnos;
	
	
	@Valid
	@OneToOne(optional = false)
	@JoinColumn(name = "asignatura_id")
	private Asignatura asignatura;
	
	
	@Valid
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "foro_id")
	private Foro foro;
	
	
	@Valid
	@ManyToOne(optional = false)
	@JoinColumn(name = "profesor_id")
	private Profesor profesor;
	
	
	@NotNull
	@Min(0)
	private Double precio;
	
	@NotNull
	@Min(0)
	private Long capacidad;
	
	@Valid
	@ManyToMany
	private Collection<Horario> horarios;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Collection<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Foro getForo() {
		return foro;
	}

	public void setForo(Foro foro) {
		this.foro = foro;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double prec) {
		precio = prec;
	}

	public Long getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}
	
	
	public Collection<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Collection<Horario> horarios) {
		this.horarios = horarios;
	}
	

	
	
	
	
	
	
	
}
