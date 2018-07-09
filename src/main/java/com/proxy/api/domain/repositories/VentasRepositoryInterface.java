package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.Kpi_Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasRepositoryInterface extends JpaRepository<Kpi_Venta, Integer> {
    Kpi_Venta getKpiVentaByCodigoProducto(String codigoProducto);
}
