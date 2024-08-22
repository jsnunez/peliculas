package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="varchar(45)", nullable = false)
    private String nombre;

    @Column(columnDefinition="varchar(45)", nullable = false)
    private String apellidos;

    private Long[] imagen;

    @Column(columnDefinition="varchar(45)", nullable = false)
    private String email;

    private Long activo;

    @Column(columnDefinition="varchar(16)", nullable = false)
    private String username;

    @Column(columnDefinition="varchar(40)", nullable = false)
    private String password;

    @Column(columnDefinition = "TIMESTAMP", nullable=false)
    private String ultimaActualizacion;

      @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direccion;
    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long[] getImagen() {
        return imagen;
    }

    public void setImagen(Long[] imagen) {
        this.imagen = imagen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getActivo() {
        return activo;
    }

    public void setActivo(Long activo) {
        this.activo = activo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
}
