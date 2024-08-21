package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Almacen;
import java.util.List;
import java.util.Optional;

public interface AlmacenService {

    List<Almacen> findAll();
    Optional<Almacen> findById(Long id);
    Almacen save(Almacen Almacen);
    Almacen update(Long id);
    Optional<Almacen> delete(Long id);
    
    }