package com.proxy.api.domain.services;

import com.proxy.api.domain.model.ValueObject.Product;
import com.proxy.api.domain.repositories.*;
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

    @Autowired
    private VentasMensualesRepositoryInterface ventasMensualesRepository;

    @Cacheable("product")
    public Product getProductByCodigoProducto(String codigoProducto) {
        return new Product(
                this.productRepository.getKpiVentaByCodigoProducto(codigoProducto),
                this.stockRepository.getKpiStockByCodigoProducto(codigoProducto),
                this.precioVentaRepository.getKpiPrecioVentasByTarifaCodigoProducto(codigoProducto),
                this.inputsRepository.getKpiInputsByCodigoProducto(codigoProducto),
                this.ventasMensualesRepository.getKpiVentaMensualesByVentaCodigoProducto(codigoProducto)
        );
    }
}
