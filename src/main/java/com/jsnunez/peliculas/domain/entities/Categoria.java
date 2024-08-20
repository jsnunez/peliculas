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
    private long id_categoria;

    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    private String nombre;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private String ultima_actualizacion; // Changed to LocalDateTime

    // Getters and setters
    public long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(byte id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(String ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
}
