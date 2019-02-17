package com.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Nota implements Serializable{
	private Integer idnota;
	private String modalidad;
	private String nivel;
	private String anio;
	private String ciclo;
	private String dia;
	private String horario;
	
	private Alumno alumno;
	private Idioma idioma;
	private Docente docente;
	
	List<Detallenota> detallenotas;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdnota() {
		return idnota;
	}
	public void setIdnota(Integer idnota) {
		this.idnota = idnota;
	}
	
	@Column(name="modalidad",length=50)
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	
	@Column(name="nivel",length=20)
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	@Column(name="anio",length=10)
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	@Column(name="ciclo",length=20)
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@ManyToOne
	@JoinColumn(name = "idalumno")
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	@ManyToOne
	@JoinColumn(name = "ididioma")
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	@ManyToOne
	@JoinColumn(name = "iddocente")
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	@OneToMany(mappedBy = "nota", cascade = CascadeType.ALL)
	public List<Detallenota> getDetallenotas() {
		return detallenotas;
	}
	public void setDetallenotas(List<Detallenota> detallenotas) {
		this.detallenotas = detallenotas;
	}

	
}
