package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Nota;
import com.app.repository.NotaRepository;

@Service
public class NotaServiceImpl implements NotaService{
	
	@Autowired
	NotaRepository notaRepository;
	
	@Override
	public Nota saveNota(Nota nota) {
		return notaRepository.save(nota);
	}

}
