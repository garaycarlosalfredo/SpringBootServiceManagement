package com.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Herramienta;
import com.management.model.Ingreso;
import com.management.service.HerramientaService;
import com.management.service.IngresoService;

@RestController

@RequestMapping("/ingreso")
public class IngresoController {
	@Autowired
	IngresoService ingresoService;
	
	@GetMapping()
	public List<Ingreso> obtenerIngresosTodos(){
		
		return ingresoService.obtenerIngresosTodos();
	}



	@GetMapping("/query")
		public List<Ingreso> obtenerNumeroSerie( @RequestParam("numeroSerie") Integer numeroSerie){
			
			return this.ingresoService.findBynumeroSerie(numeroSerie);
			
		}

	
	/*
	@GetMapping("/query")	
		public List<Ingreso> obtenerNumeroIngreso( @RequestParam("numeroIngreso") String numeroIngreso){
			return this.ingresoService.findBynumeroIngreso(numeroIngreso);
			
		}*/
	
	@PostMapping()
		public Ingreso guardarIngreso(@RequestBody Ingreso ingreso) {
		return ingresoService.guardarIngreso(ingreso);
	}
	
}
