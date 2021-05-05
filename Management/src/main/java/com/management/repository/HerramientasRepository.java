package com.management.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Herramienta;

@Repository
public interface HerramientasRepository extends CrudRepository <Herramienta, Integer>{
	public abstract Optional<Herramienta> findById(Integer id);
}
