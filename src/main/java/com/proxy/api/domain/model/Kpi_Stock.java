package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

@Entity
@Table(name = "V_Kpi_Stock", schema = "dbo", catalog = "Realidad_Aumentada")
public class Kpi_Stock implements Serializable {

    public static final String tableName = "V_Kpi_Stock";

    @Id
    @GeneratedValue
    @Column(name = "Codigo_Producto")
    private String codigoProducto;

    @Column(name = "Descripcion_Producto")
    private String descripcionProducto;

    @Column(name = "Dia_Stock")
    private String diaStock;

    @Column(name = "Ean")
    private String ean;

    @Column(name = "Stock_Almacenes_MDONA")
    private float stockAlmacenesMercadona;

    @Column(name = "Stock_Tiendas_MDONA")
    private float stockTiendasMercadona;

    @Column(name = "Stock_Total_MDONA")
    private float stockTotalMercadona;


    public Kpi_Stock() {
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

    public String getDiaStock() {
        return diaStock;
    }

    public void setDiaStock(String diaStock) {
        this.diaStock = diaStock;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getStockAlmacenesMercadona() {
        return getNumberWithFormat(this.stockAlmacenesMercadona);
    }

    public void setStockAlmacenesMercadona(float stockAlmacenesMercadona) {
        this.stockAlmacenesMercadona = stockAlmacenesMercadona;
    }

    private String getNumberWithFormat(float number) {
        return NumberFormat.getNumberInstance(Locale.ITALY).format(number);
    }

    public String getStockTiendasMercadona() {
        return getNumberWithFormat(this.stockTiendasMercadona);
    }

    public void setStockTiendasMercadona(float stockTiendasMercadona) {
        this.stockTiendasMercadona = stockTiendasMercadona;
    }

    public String getStockTotalMercadona() {
        return getNumberWithFormat(this.stockTotalMercadona);
    }

    public void setStockTotalMercadona(float stockTotalMercadona) {
        this.stockTotalMercadona = stockTotalMercadona;
    }
}
