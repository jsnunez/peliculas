package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Pago;
import java.util.List;
import java.util.Optional;

public interface PagoService  {
    
    List<Pago> findAll();
Optional<Pago> findById(Long id);
Pago save(Pago Pago);
Pago update(Long id);
Optional<Pago> delete(Long id);
}