package com.jsnunez.peliculas.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class pelicula_categoriapk implements Serializable {

    @Column(name = "id_pelicula")
        private Pelicula id_pelicula;
        
    @Column(name = "id_categoria")
    private Categoria id_categoria;

    public pelicula_categoriapk() {
    }

    public Pelicula getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Pelicula id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }
    


}
