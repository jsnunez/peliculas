package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Inventario {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id_inventario;

 @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "id_almacen", insertable = false, updatable = false)
    private Almacen almacen;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private String ultima_actualizacion; // Changed to LocalDateTime

}
