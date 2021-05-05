package com.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Herramienta;
import com.management.model.Partes;
import com.management.service.HerramientaService;

@RestController

@RequestMapping("/herramienta")
public class HerramientaController {
	@Autowired
	HerramientaService herramientaService;
	
	@GetMapping()
	public List<Herramienta> obtenerPartes(){
		
		return herramientaService.obtenerPartes();
	}	
	
	@GetMapping("/query")
	public Optional<Herramienta> obtenerHerramientaNumeroSerie( @RequestParam("id") Integer id){		
		return this.herramientaService.findHerramientaBynumeroSerie(id);
		
	}
	
	@PostMapping()
	public Herramienta guardarHerramienta(@RequestBody Herramienta herramienta) {
		return this.herramientaService.guardarHerramienta(herramienta);
	}
	
}
