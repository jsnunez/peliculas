package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pais {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id_pais;
    
    @Column(columnDefinition = "VARCHAR(50)", nullable= false)
    private String nombre;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)    
    private String ultima_actualizacion;
    public Pais() {
    }
    public short getId_pais() {
        return id_pais;
    }
    public void setId_pais(short id_pais) {
        this.id_pais = id_pais;
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
