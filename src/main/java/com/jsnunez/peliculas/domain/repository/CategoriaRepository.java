package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Categoria;

public interface CategoriaRepository  extends
CrudRepository<Categoria,Long> {
}
