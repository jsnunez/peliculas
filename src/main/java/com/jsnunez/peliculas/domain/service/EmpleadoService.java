package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService   {

    
    List<Empleado> findAll();
Optional<Empleado> findById(byte id);
Empleado save(Empleado Empleado);
Empleado update(Long id);
Optional<Empleado> delete(Long id);
}