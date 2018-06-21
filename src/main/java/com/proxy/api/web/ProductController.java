package com.proxy.api.web;

import com.proxy.api.domain.model.Producto;
import com.proxy.api.domain.services.ProductServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductController {

    @Autowired
    private ProductServicesInterface productServices;

    @RequestMapping(value = {"/{productMaterial:.*}", "/{productMaterial:.*}/"}, method = RequestMethod.GET, produces = "application/json")
    public Producto getProductAction(@PathVariable String productMaterial) {
        return productServices.getProductByCodigoMaterial(productMaterial);
    }

    @RequestMapping(value = {"/EAN/{codigoEan:.*}", "/EAN/{codigoEan:.*}/"}, method = RequestMethod.GET, produces = "application/json")
    public List<Producto> getProductByEanAction(@PathVariable String codigoEan) {
        return productServices.getProductsByEAN(codigoEan);
    }
}