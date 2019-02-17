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
public class Idioma implements Serializable{
	private Integer ididioma;
	private String idioma;

	private List<Nota> nota;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdidioma() {
		return ididioma;
	}

	public void setIdidioma(Integer ididioma) {
		this.ididioma = ididioma;
	}

	@Column(name="idioma",length=25)
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@OneToMany(mappedBy = "idioma", cascade = CascadeType.ALL)
	public List<Nota> getNota() {
		return nota;
	}

	public void setNota(List<Nota> nota) {
		this.nota = nota;
	}
	
}
