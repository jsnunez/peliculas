package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Pelicula;

public interface PeliculaRepository  extends
CrudRepository<Pelicula,Long> {
}
