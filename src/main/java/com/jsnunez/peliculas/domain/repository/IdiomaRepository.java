package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Idioma;

public interface IdiomaRepository extends
CrudRepository<Idioma,Byte> {
}
