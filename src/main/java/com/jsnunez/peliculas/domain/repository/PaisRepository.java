package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Pais;

public interface PaisRepository  extends
CrudRepository<Pais,Long> {
}