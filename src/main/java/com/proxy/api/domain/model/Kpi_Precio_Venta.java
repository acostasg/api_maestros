package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "V_Kpi_Precio_Venta", schema = "dbo", catalog = "Realidad_Aumentada")
public class Kpi_Precio_Venta implements Serializable {

    public static final String tableName = "V_Kpi_Precio_Venta";

    @Id
    @GeneratedValue
    @Column(name = "Codigo_Producto")
    private String codigoProducto;

    @Column(name = "Descripcion_Producto")
    private String descripcionProducto;

    @Column(name = "Fecha_Pcb")
    private String fechaPcb;

    @Column(name = "PCB")
    private String pcb;

    @Column(name = "Tipo_Tarifa")
    private String tipoTarifa;

    @Column(name = "Fecha_Pvp")
    private String fechaPvp;

    @Column(name = "Pvp")
    private String pvp;

    public Kpi_Precio_Venta() {
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getFechaPcb() {
        return fechaPcb;
    }

    public void setFechaPcb(String fechaPcb) {
        this.fechaPcb = fechaPcb;
    }

    public String getPcb() {
        return pcb;
    }

    public void setPcb(String pcb) {
        this.pcb = pcb;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public String getFechaPvp() {
        return fechaPvp;
    }

    public void setFechaPvp(String fechaPvp) {
        this.fechaPvp = fechaPvp;
    }

    public String getPvp() {
        return pvp;
    }

    public void setPvp(String pvp) {
        this.pvp = pvp;
    }
}


