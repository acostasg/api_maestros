package com.proxy.api.domain.model.ValueObject;

import com.proxy.api.domain.model.*;

import java.util.List;

public class Product {

    private Kpi_Venta VentasAcumuladasUltimoExercicio;
    private Kpi_Stock StockActual;
    private List<Kpi_Precio_Venta> PrecioVentasActual;
    private List<Kpi_Input> InputsMercadona;
    private List<Kpi_Venta_Mensuales> VentasPorMeses;

    public Product(
            Kpi_Venta kpiVenta,
            Kpi_Stock kpiStocks,
            List<Kpi_Precio_Venta> kpiPrecioVentas,
            List<Kpi_Input> kpiInputs,
            List<Kpi_Venta_Mensuales> kpiVentaMensuales
    ) {
        this.VentasAcumuladasUltimoExercicio = kpiVenta;
        this.StockActual = kpiStocks;
        this.PrecioVentasActual = kpiPrecioVentas;
        this.InputsMercadona = kpiInputs;
        this.VentasPorMeses = kpiVentaMensuales;
    }

    public Kpi_Venta getVentasAcumuladasUltimoExercicio() {
        return VentasAcumuladasUltimoExercicio;
    }

    public Kpi_Stock getStockActual() {
        return StockActual;
    }

    public List<Kpi_Precio_Venta> getPrecioVentasActual() {
        return PrecioVentasActual;
    }

    public List<Kpi_Input> getInputsMercadona() {
        return InputsMercadona;
    }

    public List<Kpi_Venta_Mensuales> getVentasPorMeses() {
        return VentasPorMeses;
    }
}
