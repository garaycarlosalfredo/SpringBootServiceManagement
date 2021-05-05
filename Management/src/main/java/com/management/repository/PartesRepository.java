package com.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Partes;

@Repository
public interface PartesRepository extends CrudRepository <Partes, Integer>{
	
}
