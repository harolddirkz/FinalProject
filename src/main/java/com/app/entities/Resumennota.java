package com.app.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Resumennota implements Serializable{
	private Integer idresumennota;
	private Integer notaunidad;
	
	private Detallenota  detallenota;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdresumennota() {
		return idresumennota;
	}

	public void setIdresumennota(Integer idresumennota) {
		this.idresumennota = idresumennota;
	}

	public Integer getNotaunidad() {
		return notaunidad;
	}

	public void setNotaunidad(Integer notaunidad) {
		this.notaunidad = notaunidad;
	}

	@ManyToOne
	@JoinColumn(name = "iddetallenota")
	public Detallenota getDetallenota() {
		return detallenota;
	}

	public void setDetallenota(Detallenota detallenota) {
		this.detallenota = detallenota;
	}
	

}
