package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Familia_Producto", schema = "MIUBESOL", catalog = "Benchmarking")
public class FamiliaProducto implements Serializable {

    public static final String tableName = "Familia_Producto";

    @Id
    @GeneratedValue
    @Column(name = "Codigo_Familia")
    private Integer codigoFamilia;

    @Column(name = "Descripcion_Familia")
    private String descripcionFamilia;

    public FamiliaProducto() {
    }

    public Integer getCodigoFamilia() {
        return codigoFamilia;
    }

    public void setCodigoFamilia(Integer codigoFamilia) {
        this.codigoFamilia = codigoFamilia;
    }

    public String getDescripcionFamilia() {
        return descripcionFamilia;
    }

    public void setDescripcionFamilia(String descripcionFamilia) {
        this.descripcionFamilia = descripcionFamilia;
    }

}
