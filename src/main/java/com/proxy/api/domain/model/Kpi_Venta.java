package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

@Entity
@Table(name = "V_Kpi_Venta", schema = "dbo", catalog = "Realidad_Aumentada")
public class Kpi_Venta implements Serializable {

    public static final String tableName = "V_Kpi_Venta";

    @Id
    @GeneratedValue
    @Column(name = "Codigo_Producto")
    private String codigoProducto;

    @Column(name = "Descripcion_Producto")
    private String descripcionProducto;

    @Column(name = "Unidades_Vendidas")
    private float unidadesVendidas;

    @Column(name = "Unidad_Medida")
    private String unidadMedida;

    public Kpi_Venta() {
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

    public String getUnidadesVendidas() {
        return getNumberWithFormat(this.unidadesVendidas);
    }

    public void setUnidadesVendidas(float unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    private String getNumberWithFormat(float number) {
        return NumberFormat.getNumberInstance(Locale.ITALY).format(number);
    }

}
