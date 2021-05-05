package com.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Herramienta;
import com.management.model.Ingreso;
import com.management.repository.IngresoRepository;
import com.management.repository.HerramientasRepository;

@Service
public class IngresoService {
	@Autowired
	IngresoRepository ingresoRepository;	
	HerramientasRepository herramientaRepository;
	
	public List <Ingreso> obtenerIngresosTodos(){
		return (List<Ingreso>) ingresoRepository.findAll();
	}
	

	public Optional<Ingreso> findBynumeroIngreso(String id){
		return ingresoRepository.findById(id);
	}
	
	public List<Ingreso> findBynumeroSerie(Integer numeroSerie){
		return ingresoRepository.findByNumeroSerieId(numeroSerie);
	}
	
	public Ingreso guardarIngreso (Ingreso ingreso) {
		return ingresoRepository.save(ingreso);
	}

}
