package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoryInterface extends JpaRepository<Producto, Integer> {
    List<Producto> getProductosByCodigoDeBarras(String codigoDeBarras);

    Producto getProductoByCodigoMaterial(String codigoMaterial);
}
