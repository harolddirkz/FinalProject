package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.entities.Alumno;
import com.app.service.AlumnoService;


@Controller
@RequestMapping(value = "/alumno")
public class AlumnoController {
	
	@Autowired
	AlumnoService as;

	@RequestMapping(value = "/guardar", method = RequestMethod.GET)
	public ModelAndView guardarAlumnoVista() {
		ModelAndView model = new ModelAndView("views/alumno/registraralumno");

		return model;
	}

	@RequestMapping(value = "/saveAlumno", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> guardarAlumno(HttpServletRequest r) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("123");
		
		String nombrealumno = r.getParameter("nombrealumno");
		String apellidoalumno = r.getParameter("apellidoalumno");
		String dnialumno = r.getParameter("dnialumno");
		
		System.out.println(nombrealumno);
		
		Alumno alumno = new Alumno();
		alumno.setNombre(nombrealumno);
		alumno.setApellido(apellidoalumno);
		alumno.setDni(dnialumno);

		Alumno alumno2 = as.saveAlumno(alumno);
		System.out.println(alumno2.getIdalumno());
		
		

		map.put("status", "1");

		return map;
	}
}
