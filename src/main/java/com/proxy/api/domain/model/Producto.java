package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "V_Producto_SAP")
public class Producto implements Serializable {

    public static final String tableName = "V_Producto_Realidad_Augmentada";

    @Id
    @GeneratedValue
    @Column(name = "Codigo_Material")
    private String codigoMaterial;

    @Column(name = "Numero_Articulo_Europeo")
    private String codigoDeBarras;

    @Column(name = "Descripcion_Material")
    private String descripcionMaterial;

    public Producto() {
    }

    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
