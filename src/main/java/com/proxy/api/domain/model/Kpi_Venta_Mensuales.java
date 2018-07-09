package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "V_Kpi_Ventas_Mensuales", schema = "dbo", catalog = "Realidad_Aumentada")
public class Kpi_Venta_Mensuales implements Serializable {

    public static final String tableName = "V_Kpi_Ventas_Mensuales";

    @EmbeddedId
    private IdKeyVentasMensuales venta;

    @Column(name = "Descripcion_Producto")
    private String descripcionProducto;

    @Column(name = "Unidades_Vendidas")
    private float unidadesVendidas;

    @Column(name = "Unidad_Medida")
    private String unidadMedida;


    public Kpi_Venta_Mensuales() {
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public float getUnidadesVendidas() {
        return unidadesVendidas;
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

    public IdKeyVentasMensuales getVenta() {
        return venta;
    }

    public void setVenta(IdKeyVentasMensuales venta) {
        this.venta = venta;
    }
}
