package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Almacen;

public interface AlmacenRepository extends
CrudRepository<Almacen,Byte> {
}
