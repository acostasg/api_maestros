package com.proxy.api.domain.model;

import org.springframework.cache.annotation.Cacheable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Sub_Familia_Producto", schema = "MIUBESOL", catalog = "Benchmarking")
@Cacheable("SubFamiliaProducto")
public class SubFamiliaProducto implements Serializable {

    public static final String tableName = "SubFamilia_Producto";

    @EmbeddedId
    private IdKeySubFamily idKeySubFamily;

    @Column(name = "Descripcion_Sub_Familia")
    private String descripcionSubFamilia;


    public SubFamiliaProducto() {
    }

    public IdKeySubFamily getIdKeySubFamily() {
        return idKeySubFamily;
    }

    public void setIdKeySubFamily(IdKeySubFamily idKeySubFamily) {
        this.idKeySubFamily = idKeySubFamily;
    }

    public String getDescripcionSubFamilia() {
        return descripcionSubFamilia;
    }

    public void setDescripcionSubFamilia(String descripcionSubFamilia) {
        this.descripcionSubFamilia = descripcionSubFamilia;
    }

}
