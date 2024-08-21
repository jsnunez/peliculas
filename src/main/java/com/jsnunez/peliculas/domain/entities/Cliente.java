package com.jsnunez.peliculas.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen id_almacen;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombre;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellido;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String email;

    @ManyToOne
    private Direccion id_direccion;

    @Column(columnDefinition = "TINYINT(1)", nullable = false)
    private Integer activo;

    // @Column(columnDefinition = "DATETIME", nullable = false)
    // private LocalDateTime fecha_creacion;


    // @Column(columnDefinition = "TIMESTAMP", nullable = false)
    // private LocalDateTime ultima_actualizacion;

@Embedded
Audit audit=new Audit();

    public Long getId_cliente() {
        return id_cliente;
    }


    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }


    public Almacen getId_almacen() {
        return id_almacen;
    }


    public void setId_almacen(Almacen id_almacen) {
        this.id_almacen = id_almacen;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Direccion getId_direccion() {
        return id_direccion;
    }


    public void setId_direccion(Direccion id_direccion) {
        this.id_direccion = id_direccion;
    }


    public Integer getActivo() {
        return activo;
    }


    public void setActivo(Integer activo) {
        this.activo = activo;
    }


    // public LocalDateTime getFecha_creacion() {
    //     return fecha_creacion;
    // }


    // public void setFecha_creacion(LocalDateTime fecha_creacion) {
    //     this.fecha_creacion = fecha_creacion;
    // }


    public Audit getAudit() {
        return audit;
    }


    public void setAudit(Audit audit) {
        this.audit = audit;
    }


    // public LocalDateTime getUltima_actualizacion() {
    //     return ultima_actualizacion;
    // }


    // public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
    //     this.ultima_actualizacion = ultima_actualizacion;
    // }
}