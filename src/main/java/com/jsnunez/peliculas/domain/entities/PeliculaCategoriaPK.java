package com.jsnunez.peliculas.domain.entities;

import java.io.Serializable;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaCategoriaPK implements Serializable {
    private Long id_pelicula;
    private Long id_categoria;

    // Default constructor
    public PeliculaCategoriaPK() {}

    // Parameterized constructor, equals, hashCode methods
}
