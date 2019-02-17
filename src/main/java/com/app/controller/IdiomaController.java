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

import com.app.entities.Idioma;
import com.app.service.IdiomaService;


@Controller
@RequestMapping(value = "/idioma")
public class IdiomaController {
	
	@Autowired
	IdiomaService is;
	
	@RequestMapping(value = "/guardar", method = RequestMethod.GET)
	public ModelAndView guardarIdiomaVista() {
		ModelAndView model = new ModelAndView("views/idioma/saveIdioma");

		return model;
	}
	
	@RequestMapping(value = "/saveIdioma", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> guardarIdioma(HttpServletRequest r) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("123456");
		
		String idioma = r.getParameter("idioma");
		
		System.out.println(idioma);
		
		Idioma idm = new Idioma();
		idm.setIdioma(idioma);
		
		Idioma idm2 = is.saveIdioma(idm);

				
		
		map.put("status", "1");

		return map;
	}
}
