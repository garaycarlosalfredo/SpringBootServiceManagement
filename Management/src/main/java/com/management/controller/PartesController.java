package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Partes;
import com.management.service.PartesService;

@RestController

@RequestMapping("/partes")
public class PartesController {
	@Autowired
	PartesService partesService;
	
	@GetMapping()
	public List<Partes> obtenerPartes(){		
		return partesService.obtenerPartes();
	}
	
	@PostMapping()
	public Partes guardarPartes(@RequestBody Partes partes) {
		return this.partesService.guardarParte(partes);
	}
	
}
