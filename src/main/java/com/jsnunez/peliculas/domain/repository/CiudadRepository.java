package com.jsnunez.peliculas.domain.repository;
import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Ciudad;
public interface CiudadRepository extends
CrudRepository<Ciudad,Short> {
}
