package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.Kpi_Precio_Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrecioVentaRepositoryInterface extends JpaRepository<Kpi_Precio_Venta, Integer> {
    List<Kpi_Precio_Venta> getKpi_VentasByCodigoProducto(String codigoProducto);
}
