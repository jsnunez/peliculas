package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CategoriaPelicula {
    @EmbeddedId
    private PeliculaCategoriaPK id;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private String ultima_actualizacion; // Changed to LocalDateTime

    // Getters and setters
    public PeliculaCategoriaPK getId() {
        return id;
    }

    public void setId(PeliculaCategoriaPK id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(String ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
}
