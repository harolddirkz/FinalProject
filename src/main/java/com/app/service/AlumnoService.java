package com.app.service;

import java.util.List;

import com.app.entities.Alumno;

public interface AlumnoService {
	public Alumno saveAlumno(Alumno alumno);
	public List<Alumno>listarAlumno();

}
