package com.management.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Herramienta;
import com.management.model.Ingreso;

@Repository
public interface IngresoRepository extends CrudRepository <Ingreso, String>{
	//Buscar todos los ingresos
	public abstract Optional<Ingreso> findById(String id);	
	//Buscar todos los ingresos de una herramienta
	public abstract List<Ingreso> findByNumeroSerieId(Integer numeroSerie);
	//Buscar todos los ingresos de una fecha
	//Buscar todos los ingresos de un determinado cliente
	
}
