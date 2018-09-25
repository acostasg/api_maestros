package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.MarcaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepositoryInterface extends JpaRepository<MarcaProducto, Integer> {

    List<MarcaProducto> getByEmpresaId(String $empresaID);

}
