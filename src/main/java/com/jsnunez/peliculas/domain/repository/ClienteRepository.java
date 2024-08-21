package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Cliente;

public interface ClienteRepository  extends
CrudRepository<Cliente,Short> {
}
