package com.jsnunez.peliculas.domain.entities;


import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id_actor;
     @Column(columnDefinition = "VARCHAR(45)", nullable= false)
   @NotNull(message = "xfdggf")
    private String nombre;
    @Column(columnDefinition = "VARCHAR(45)", nullable= false)
    private String apellido;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)
    private String ultima_actualizacion;
    @Embedded
Audit audit=new Audit();
    public Actor() {
    }
    public long getId_actor() {
        return id_actor;
    }
    public void setId_actor(Long id_actor) {
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
