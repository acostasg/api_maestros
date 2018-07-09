package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.Kpi_Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepositoryInterface extends JpaRepository<Kpi_Stock, Integer> {
    Kpi_Stock getKpiStockByCodigoProducto(String codigoProducto);
}
