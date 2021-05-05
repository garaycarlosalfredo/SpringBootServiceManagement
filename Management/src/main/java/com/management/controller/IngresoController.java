package com.management.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Ingreso;
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
	public List<Ingreso> obtenerClienteFecha( 
			@RequestParam("cliente") String cliente,
			@RequestParam("fechaIngreso") @DateTimeFormat(pattern="yyyy-MM-dd") Date fechaIngreso){			
		return this.ingresoService.findByClienteAndFechaIngreso(cliente, fechaIngreso);
	}

//	@GetMapping("/query")
//		public List<Ingreso> obtenerNumeroSerie( @RequestParam("numeroSerie") Integer numeroSerie){			
//			return this.ingresoService.findBynumeroSerie(numeroSerie);			
//		}
	
	@PostMapping()
		public Ingreso guardarIngreso(@RequestBody Ingreso ingreso) {
		return ingresoService.guardarIngreso(ingreso);
	}
	
	@DeleteMapping( path = "/{id}") 
	public String eliminarIngresoPorId(@PathVariable("id") String id) {
		boolean ok = this.ingresoService.eliminarIngreso(id);
		if(ok) {
			return "Se eliminó correctamente con id = " + id;
		}else {
			return "No se pudo eliminar correctamente con id = " + id;
		}
	}
	
}
