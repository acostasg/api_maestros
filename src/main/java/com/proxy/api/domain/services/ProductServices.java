package com.proxy.api.domain.services;

import com.proxy.api.domain.model.Producto;
import com.proxy.api.domain.repositories.ProductRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices implements ProductServicesInterface {

    @Autowired
    private ProductRepositoryInterface productRepository;

    public List<Producto> getProductsByEAN(String productEAN){
        return this.productRepository.getProductosByCodigoDeBarras(productEAN);
    }

    public Producto getProductByCodigoMaterial(String codigoMaterial){
        return this.productRepository.getProductoByCodigoMaterial(codigoMaterial);
    }
}
