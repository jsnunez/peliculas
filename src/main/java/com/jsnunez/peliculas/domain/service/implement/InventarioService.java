package com.jsnunez.peliculas.domain.service.implement;


import com.jsnunez.peliculas.domain.entities.Inventario;
import java.util.List;
import java.util.Optional;

public interface InventarioService   {
    
    List<Inventario> findAll();
Optional<Inventario> findById(Long id);
Inventario save(Inventario Inventario);
Inventario update(Long id);
Optional<Inventario> delete(Long id);
}