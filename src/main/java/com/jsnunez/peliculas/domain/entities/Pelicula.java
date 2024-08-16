package com.jsnunez.peliculas.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pelicula;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descripcion;

    @Column(columnDefinition = "YEAR", nullable = false)
    private String anyo_lanzamiento;

    @ManyToOne
    @JoinColumn(name = "id_idioma")
    private Idioma idioma;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private Integer duracion_alquiler;

    @Column(columnDefinition = "DECIMAL(4,2)", nullable = false)
    private BigDecimal rental_rate;

    @Column(columnDefinition = "SMALLINT", nullable = false)
    private Integer duracion;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = false)
    private BigDecimal replacement_cost;

    @Column(columnDefinition = "ENUM('G', 'PG', 'PG-13', 'R', 'NC-17')", nullable = false)
    private String clasificacion;

    @Column(columnDefinition = "SET('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')", nullable = false)
    private String caracteristicas_especiales;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    @ManyToOne
    @JoinColumn(name = "id_idioma_original")
    private Idioma idioma_original;

    public Long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAnyo_lanzamiento() {
        return anyo_lanzamiento;
    }

    public void setAnyo_lanzamiento(String anyo_lanzamiento) {
        this.anyo_lanzamiento = anyo_lanzamiento;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Integer getDuracion_alquiler() {
        return duracion_alquiler;
    }

    public void setDuracion_alquiler(Integer duracion_alquiler) {
        this.duracion_alquiler = duracion_alquiler;
    }

    public BigDecimal getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(BigDecimal rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public BigDecimal getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(BigDecimal replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCaracteristicas_especiales() {
        return caracteristicas_especiales;
    }

    public void setCaracteristicas_especiales(String caracteristicas_especiales) {
        this.caracteristicas_especiales = caracteristicas_especiales;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Idioma getIdioma_original() {
        return idioma_original;
    }

    public void setIdioma_original(Idioma idioma_original) {
        this.idioma_original = idioma_original;
    }
    

    
    
    

}