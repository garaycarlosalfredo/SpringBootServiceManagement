package com.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Herramienta;
import com.management.model.Partes;
import com.management.repository.HerramientasRepository;

@Service
public class HerramientaService {
	@Autowired
	HerramientasRepository herramientaRepository;
	
	public List<Herramienta> obtenerPartes(){
		return (List<Herramienta>) herramientaRepository.findAll();
	}

	public Optional<Herramienta> findHerramientaBynumeroSerie(Integer id){
		return herramientaRepository.findById(id);
	}
	
	//Guardar herramienta "POST"
	public Herramienta guardarHerramienta( Herramienta herramienta ) {
		return herramientaRepository.save(herramienta);
	}
}
