package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ciudad {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id_ciudad;
        @Column(columnDefinition = "VARCHAR(50)", nullable= false)
    private String nombre;
    @Column(columnDefinition = "TIMESTAMP", nullable= false)    
    private String ultima_actualizacion;

      @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
}
