package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.Kpi_Stock;
import com.proxy.api.domain.model.Kpi_Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepositoryInterface extends JpaRepository<Kpi_Stock, Integer> {
    List<Kpi_Stock> getKpi_StocksByCodigoProducto(String codigoProducto);
}
