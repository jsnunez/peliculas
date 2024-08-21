package com.jsnunez.peliculas.domain.service.implement;


import com.jsnunez.peliculas.domain.entities.Idioma;
import java.util.List;
import java.util.Optional;

public interface IdiomaService  {
    
    List<Idioma> findAll();
Optional<Idioma> findById(Long id);
Idioma save(Idioma Idioma);
Idioma update(Long id);
Optional<Idioma> delete(Long id);
}