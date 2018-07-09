package com.proxy.api.domain.model.ValueObject;

import com.proxy.api.domain.model.Kpi_Input;
import com.proxy.api.domain.model.Kpi_Precio_Venta;
import com.proxy.api.domain.model.Kpi_Stock;
import com.proxy.api.domain.model.Kpi_Venta;

import java.util.List;

public class Product {

    private List<Kpi_Venta> kpiVentas;
    private List<Kpi_Stock> kpiStocks;
    private List<Kpi_Precio_Venta> kpiPrecioVentas;
    private List<Kpi_Input> kpiInputs;

    public Product(
            List<Kpi_Venta> kpiVenta,
            List<Kpi_Stock> kpiStocks,
            List<Kpi_Precio_Venta> kpiPrecioVentas,
            List<Kpi_Input> kpiInputs
    ) {
        this.kpiVentas = kpiVenta;
        this.kpiStocks = kpiStocks;
        this.kpiPrecioVentas = kpiPrecioVentas;
        this.kpiInputs = kpiInputs;
    }

    public List<Kpi_Venta> getKpiVentas() {
        return kpiVentas;
    }

    public List<Kpi_Stock> getKpiStocks() {
        return kpiStocks;
    }

    public List<Kpi_Precio_Venta> getKpiPrecioVentas() {
        return kpiPrecioVentas;
    }

    public List<Kpi_Input> getKpiInputs() {
        return kpiInputs;
    }
}
