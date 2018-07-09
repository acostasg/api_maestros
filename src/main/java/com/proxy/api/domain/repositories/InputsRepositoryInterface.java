package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.Kpi_Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InputsRepositoryInterface extends JpaRepository<Kpi_Input, Integer> {
    List<Kpi_Input> getKpi_InputsByCodigoProducto(String codigoProducto);
}
