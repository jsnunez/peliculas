package com.jsnunez.peliculas.domain.entities;

import java.io.Serializable;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaCategoriaPK implements Serializable {
    private Long id_pelicula;
    private Long id_categoria;

    // Default constructor
    public PeliculaCategoriaPK() {}

    public Long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    
    // Parameterized constructor, equals, hashCode methods
}
