package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.entities.Docente;
import com.app.service.DocenteService;

@Controller
@RequestMapping(value = "/docente")
public class DocenteController {
	
	@Autowired
	DocenteService ds;

	@RequestMapping(value = "/guardar", method = RequestMethod.GET)
	public ModelAndView guardarDocenteVista() {
		ModelAndView model = new ModelAndView("views/docente/savedocente");

		return model;
	}

	@RequestMapping(value = "/saveDocente", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> guardarDocente(HttpServletRequest r) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		System.out.println("123docente");
		
		String nombre = r.getParameter("nombre");
		String apellido = r.getParameter("apellido");
		String dni = r.getParameter("dni");
		String telefono = r.getParameter("telefono");
		System.out.println(nombre+" "+apellido+" "+dni+" "+telefono);
		
		Docente docente = new Docente();
		
		docente.setNombre(nombre);
		docente.setApellido(apellido);
		docente.setDni(dni);
		docente.setTelefono(telefono);
		
		Docente d = ds.saveDocente(docente);
		
		
		
		map.put("status", "1");

		return map;
		
	}

}
