package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Direccion;

public interface DireccionRepository  extends
CrudRepository<Direccion,Short> {
}
