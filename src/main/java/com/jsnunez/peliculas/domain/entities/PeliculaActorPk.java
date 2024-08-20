package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaActorPk {
  private Long id_pelicula;
    private Long id_actor;

}
