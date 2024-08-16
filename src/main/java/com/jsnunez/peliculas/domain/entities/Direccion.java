package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Direccion {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private short id_direccion;
     @Column(columnDefinition = "VARCHAR(50)", nullable= false)
    private String direccion;
    
    @Column(columnDefinition = "VARCHAR(50)", nullable= false)
    private String direccion2;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)    
    private String ultima_actualizacion;
}
