package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id_categoria;
       @Column(columnDefinition = "VARCHAR(25)", nullable= false)
    private String nombre;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)    
    private String ultima_actualizacion;
}
