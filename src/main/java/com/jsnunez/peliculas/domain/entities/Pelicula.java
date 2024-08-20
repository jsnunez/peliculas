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

    // Getters and setters
    // (Include all getter and setter methods here)
}
