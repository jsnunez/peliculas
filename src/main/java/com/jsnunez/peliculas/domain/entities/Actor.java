package com.jsnunez.peliculas.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private short id_actor;
     @Column(columnDefinition = "VARCHAR(45)", nullable= false)
    private String nombre;
    @Column(columnDefinition = "VARCHAR(45)", nullable= false)
    private String apellido;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)
    private String ultima_actualizacion;
    public Actor() {
    }
    public int getId_actor() {
        return id_actor;
    }
    public void setId_actor(short id_actor) {
        this.id_actor = id_actor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUltima_actualizacion() {
        return ultima_actualizacion;
    }
    public void setUltima_actualizacion(String ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    
}
