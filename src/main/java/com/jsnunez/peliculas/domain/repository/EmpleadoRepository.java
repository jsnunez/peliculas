package com.jsnunez.peliculas.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Empleado;

public interface EmpleadoRepository  extends
CrudRepository<Empleado,Long> {
}