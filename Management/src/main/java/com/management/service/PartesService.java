package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Partes;
import com.management.repository.PartesRepository;

@Service
public class PartesService {
	@Autowired
	PartesRepository partesRepository;
	
	//Obtener partes "GET"
	public List<Partes> obtenerPartes(){
		return (List<Partes>) partesRepository.findAll();
	}
	
	//Guardar parte "POST"
	public Partes guardarParte( Partes partes ) {
		return partesRepository.save(partes);
	}
	
}
