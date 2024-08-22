package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Direccion;
import java.util.List;
import java.util.Optional;

public interface DireccionService   {

    
    List<Direccion> findAll();
Optional<Direccion> findById(short id);
Direccion save(Direccion Direccion);
Direccion update(Long id);
Optional<Direccion> delete(Long id);
}

