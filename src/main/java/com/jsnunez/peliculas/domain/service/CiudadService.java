package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Ciudad;
import java.util.List;
import java.util.Optional;

public interface CiudadService  {

    
    List<Ciudad> findAll();
Optional<Ciudad> findById(Short id);
Ciudad save(Ciudad Ciudad);
Ciudad update(Long id);
Optional<Ciudad> delete(Long id);
}