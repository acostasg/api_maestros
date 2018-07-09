package com.proxy.api.domain.services;

import com.proxy.api.domain.model.ValueObject.Product;

public interface ProductServicesInterface {
    Product getProductByCodigoProducto(String codigoProducto);
}
