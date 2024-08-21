package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Inventario;

public interface InventarioRepository  extends
CrudRepository<Inventario,Short> {
}