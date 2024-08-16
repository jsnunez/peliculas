package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private byte id_idioma;
    @Column(columnDefinition = "CHAR(20)", nullable= false)
    private String nombre;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)    
    private String ultima_actualizacion;
    public Idioma() {
    }
    public byte getId_idioma() {
        return id_idioma;
    }
    public void setId_idioma(byte id_idioma) {
        this.id_idioma = id_idioma;
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
