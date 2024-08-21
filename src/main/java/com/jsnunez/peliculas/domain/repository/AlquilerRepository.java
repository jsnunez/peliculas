package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Alquiler;

public interface AlquilerRepository extends
CrudRepository<Alquiler,Integer> {
}
