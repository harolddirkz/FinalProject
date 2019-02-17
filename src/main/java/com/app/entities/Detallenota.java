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
public class Detallenota implements Serializable {
	private Integer iddetallenota;
	private Double promediodetallenota;
	private String criterio;

	private Nota nota;

	List<Resumennota> resumennota;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIddetallenota() {
		return iddetallenota;
	}

	public void setIddetallenota(Integer iddetallenota) {
		this.iddetallenota = iddetallenota;
	}

	public Double getPromediodetallenota() {
		return promediodetallenota;
	}

	public void setPromediodetallenota(Double promediodetallenota) {
		this.promediodetallenota = promediodetallenota;
	}

	@Column(name="criterio",length=20)
	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	@ManyToOne
	@JoinColumn(name = "idnota")
	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	@OneToMany(mappedBy = "detallenota", cascade = CascadeType.ALL)
	public List<Resumennota> getResumennota() {
		return resumennota;
	}

	public void setResumennota(List<Resumennota> resumennota) {
		this.resumennota = resumennota;
	}

}
