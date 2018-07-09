package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.IdKeyVentasMensuales;
import com.proxy.api.domain.model.Kpi_Venta_Mensuales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentasMensualesRepositoryInterface extends JpaRepository<Kpi_Venta_Mensuales, IdKeyVentasMensuales> {
    List<Kpi_Venta_Mensuales> getKpiVentaMensualesByVentaCodigoProducto(String codigoProducto);
}
