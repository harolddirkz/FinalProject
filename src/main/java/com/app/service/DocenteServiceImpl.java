package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Docente;
import com.app.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {
	@Autowired
	DocenteRepository docenteRepository;
	
	@Override
	public Docente saveDocente(Docente docente) {
		return docenteRepository.save(docente);
	}
	

}
