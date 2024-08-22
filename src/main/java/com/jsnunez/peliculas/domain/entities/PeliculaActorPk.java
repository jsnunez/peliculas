package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaActorPk {
  private Long id_pelicula;
    private Long id_actor;
    public Long getId_pelicula() {
      return id_pelicula;
    }
    public void setId_pelicula(Long id_pelicula) {
      this.id_pelicula = id_pelicula;
    }
    public Long getId_actor() {
      return id_actor;
    }
    public void setId_actor(Long id_actor) {
      this.id_actor = id_actor;
    }

}
