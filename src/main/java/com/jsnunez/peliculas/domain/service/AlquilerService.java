package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Alquiler;
import java.util.List;
import java.util.Optional;
public interface AlquilerService  {
    
    List<Alquiler> findAll();
Optional<Alquiler> findById(Long id);
Alquiler save(Alquiler Alquiler);
Alquiler update(Long id);
Optional<Alquiler> delete(Long id);
}