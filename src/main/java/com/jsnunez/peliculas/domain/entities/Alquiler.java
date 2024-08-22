package com.jsnunez.peliculas.domain.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SMALLINT", name = "id_alquiler")
    private Integer alquilerId;

    @Column(columnDefinition = "datetime", name = "fecha_aquiler")
    private String fecha_aquiler;

    // @ManyToOne
    // @JoinColumn(name = "id_inventario")
    // private Inventario inventarioId;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente clienteId;

    @Column(name = "fecha_devolucion")
    private String fecha_devolucion;
   

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleadoId;

    @ManyToOne
    @JoinColumn(name = "id_inventario")
    private Inventario inventarioId;

    @Column (columnDefinition = "TIMESTAMP", name = "ultima_actualizacion")
    private String ultimaActualizacion;


    public Integer getAlquilerId() {
        return alquilerId;
    }


    public void setAlquilerId(Integer alquilerId) {
        this.alquilerId = alquilerId;
    }


    public String getFecha_aquiler() {
        return fecha_aquiler;
    }


    public void setFecha_aquiler(String fecha_aquiler) {
        this.fecha_aquiler = fecha_aquiler;
    }


    public Cliente getClienteId() {
        return clienteId;
    }


    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }


    public String getFecha_devolucion() {
        return fecha_devolucion;
    }


    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }


 


    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }


    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
    


}

