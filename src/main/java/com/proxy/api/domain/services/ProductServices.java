package com.proxy.api.domain.services;

import com.proxy.api.domain.model.ValueObject.Product;
import com.proxy.api.domain.repositories.InputsRepositoryInterface;
import com.proxy.api.domain.repositories.PrecioVentaRepositoryInterface;
import com.proxy.api.domain.repositories.StockRepositoryInterface;
import com.proxy.api.domain.repositories.VentasRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class ProductServices implements ProductServicesInterface {

    @Autowired
    private VentasRepositoryInterface productRepository;

    @Autowired
    private StockRepositoryInterface stockRepository;

    @Autowired
    private PrecioVentaRepositoryInterface precioVentaRepository;

    @Autowired
    private InputsRepositoryInterface inputsRepository;

    @Cacheable("product")
    public Product getProductByCodigoProducto(String codigoProducto) {
        return new Product(
                this.productRepository.getKpi_VentasByCodigoProducto(codigoProducto),
                this.stockRepository.getKpi_StocksByCodigoProducto(codigoProducto),
                this.precioVentaRepository.getKpi_VentasByCodigoProducto(codigoProducto),
                this.inputsRepository.getKpi_InputsByCodigoProducto(codigoProducto)
        );
    }
}
