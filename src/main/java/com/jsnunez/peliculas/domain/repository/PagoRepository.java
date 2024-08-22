package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Pago;

public interface PagoRepository  extends
CrudRepository<Pago,Integer> {
}