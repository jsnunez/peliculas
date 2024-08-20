package com.jsnunez.peliculas.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SMALLINT", name = "id_pago")
    private Integer pagoId;

    @ManyToOne
    private Cliente clienteId;
    @ManyToOne
    private Empleado empleadoId;

    @ManyToOne
    private Alquiler alquilerId;

    @Column(columnDefinition = "TINYINT",name = "fecha")
    private String fecha;

    @Column(name = "total")
    private Float total;

    @Column (columnDefinition = "datetime", name = "fecha_pago")
    private String fechapago;

    @Column (columnDefinition = "TIMESTAMP", name = "ultima_actualizacion")
    private String ultimaActualizacion;

    public Integer getPagoId() {
        return pagoId;
    }

    public void setPagoId(Integer pagoId) {
        this.pagoId = pagoId;
    }

 


 

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

   
    
}
