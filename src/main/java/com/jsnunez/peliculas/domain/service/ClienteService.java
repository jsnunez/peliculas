package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService   {
    
    List<Cliente> findAll();
Optional<Cliente> findById(Long id);
Cliente save(Cliente Cliente);
Cliente update(Long id);
Optional<Cliente> delete(Long id);
}