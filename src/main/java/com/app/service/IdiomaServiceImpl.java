package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Idioma;
import com.app.repository.IdiomaRepository;

@Service
public class IdiomaServiceImpl implements IdiomaService{
	
	@Autowired
	IdiomaRepository idiomaRepository;
	
	@Override
	public Idioma saveIdioma(Idioma idioma) {
		return idiomaRepository.save(idioma);
	}
	

}
