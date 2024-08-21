package com.jsnunez.peliculas.domain.service;


import java.util.List;
import java.util.Optional;
import com.jsnunez.peliculas.domain.entities.Pelicula;

public interface PeliculaService  {

    
    List<Pelicula> findAll();
Optional<Pelicula> findById(Long id);
Pelicula save(Pelicula Pelicula);
Pelicula update(Long id);
Optional<Pelicula> delete(Long id);
}
