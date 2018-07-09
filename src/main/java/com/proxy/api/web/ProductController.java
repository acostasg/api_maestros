package com.proxy.api.web;

import com.proxy.api.domain.model.ValueObject.Product;
import com.proxy.api.domain.services.ProductServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductController {

    @Autowired
    private ProductServicesInterface productServices;

    @RequestMapping(value = {"/{productMaterial:.*}", "/{productMaterial:.*}/"}, method = RequestMethod.GET, produces = "application/json")
    public Product getProductAction(@PathVariable String productMaterial) {
        return productServices.getProductByCodigoProducto(productMaterial);
    }
}