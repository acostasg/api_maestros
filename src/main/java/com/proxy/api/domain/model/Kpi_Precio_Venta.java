package com.proxy.api.domain.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "V_Kpi_Precio_Venta", schema = "dbo", catalog = "Realidad_Aumentada")
public class Kpi_Precio_Venta implements Serializable {

    public static final String tableName = "V_Kpi_Precio_Venta";

    @EmbeddedId
    private IdKeyPrecioVenta tarifa;

    @NotNull
    @Column(name = "Fecha_Pvp")
    private String fechaPvp;

    @NotNull
    @Column(name = "Fecha_Pcb")
    private String fechaPcb;


    @Column(name = "Descripcion_Producto")
    private String descripcionProducto;

    @Column(name = "PCB")
    private String pcb;

    @Column(name = "Pvp")
    private String pvp;

    public Kpi_Precio_Venta() {
    }

    public IdKeyPrecioVenta getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(IdKeyPrecioVenta tarifa) {
        this.tarifa = tarifa;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getPcb() {
        return pcb;
    }

    public void setPcb(String pcb) {
        this.pcb = pcb;
    }

    public String getPvp() {
        return pvp;
    }

    public void setPvp(String pvp) {
        this.pvp = pvp;
    }

    public String getFechaPvp() {
        return fechaPvp;
    }

    public void setFechaPvp(String fechaPvp) {
        this.fechaPvp = fechaPvp;
    }

    public String getFechaPcb() {
        return fechaPcb;
    }

    public void setFechaPcb(String fechaPcb) {
        this.fechaPcb = fechaPcb;
    }
}


