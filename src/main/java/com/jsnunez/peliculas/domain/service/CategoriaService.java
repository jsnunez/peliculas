package com.jsnunez.peliculas.domain.service;

import java.util.List;
import java.util.Optional;

import com.jsnunez.peliculas.domain.entities.Categoria;

public interface CategoriaService  {
    
    List<Categoria> findAll();
Optional<Categoria> findById(Long id);
Categoria save(Categoria Categoria);
Categoria update(Long id);
Optional<Categoria> delete(Long id);
}