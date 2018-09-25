package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "WEB_PROD_COMP_MARCA", schema = "MIUBESOL", catalog = "Benchmarking")
public class MarcaProducto implements Serializable {

    public static final String tableName = "Marca_Producto";

    @Id
    @GeneratedValue
    @Column(name = "MARCA_ID")
    private Integer codigoMarca;

    @Column(name = "MARCA_DES")
    private String descripcionMarca;

    @Column(name = "EMPRESA_EXPERT")
    private String empresaId;

    public MarcaProducto() {
    }

    public Integer getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Integer codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }

    public String getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(String empresaId) {
        this.empresaId = empresaId;
    }
}
