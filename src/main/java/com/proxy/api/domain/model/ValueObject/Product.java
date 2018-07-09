package com.proxy.api.domain.model.ValueObject;

import com.proxy.api.domain.model.Kpi_Input;
import com.proxy.api.domain.model.Kpi_Precio_Venta;
import com.proxy.api.domain.model.Kpi_Stock;
import com.proxy.api.domain.model.Kpi_Venta;

import java.util.List;

public class Product {

    private Kpi_Venta VentasAcumuladasUltimoAño;
    private Kpi_Stock StockActual;
    private List<Kpi_Precio_Venta> PrecioVentasActual;
    private List<Kpi_Input> InputsMercadona;

    public Product(
            Kpi_Venta kpiVenta,
            Kpi_Stock kpiStocks,
            List<Kpi_Precio_Venta> kpiPrecioVentas,
            List<Kpi_Input> kpiInputs
    ) {
        this.VentasAcumuladasUltimoAño = kpiVenta;
        this.StockActual = kpiStocks;
        this.PrecioVentasActual = kpiPrecioVentas;
        this.InputsMercadona = kpiInputs;
    }

    public Kpi_Venta getVentasAcumuladasUltimoAño() {
        return VentasAcumuladasUltimoAño;
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
}
