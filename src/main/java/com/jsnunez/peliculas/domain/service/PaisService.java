package com.jsnunez.peliculas.domain.service;

import java.util.List;
import java.util.Optional;
import com.jsnunez.peliculas.domain.entities.Pais;

public interface PaisService {
    
    List<Pais> findAll();
Optional<Pais> findById(Long id);
Pais save(Pais Pais);
Pais update(Long id);
Optional<Pais> delete(Long id);
}