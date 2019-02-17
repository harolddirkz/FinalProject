package com.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente implements Serializable{
	
	private Integer iddocente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String dni;
	
	private List<Nota> notas;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIddocente() {
		return iddocente;
	}

	public void setIddocente(Integer iddocente) {
		this.iddocente = iddocente;
	}

	@Column(name="nombre",length=50)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name="apellido",length=50)
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Column(name="telefono",length=20)
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name="dni",length=8)
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@OneToMany(mappedBy = "docente", cascade = CascadeType.ALL)
	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	
}
