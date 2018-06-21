package com.proxy.api.domain.services;

import com.proxy.api.domain.model.Producto;

import java.util.List;

public interface ProductServicesInterface {
    List<Producto> getProductsByEAN(String productEAN);

    Producto getProductByCodigoMaterial(String codigoMaterial);
}
