package com.proxy.api.web;

import com.proxy.api.domain.model.MarcaProducto;
import com.proxy.api.domain.services.MarcaServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class BrandController {

    @Autowired
    private MarcaServicesInterface marcaServices;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET, produces = "application/json")
    public List<MarcaProducto> marcasAction() {
        return marcaServices.getAll();
    }

    @RequestMapping(value = {"/empresa/{empresaId:.*}", "/empresa/{empresaId:.*}/"}, method = RequestMethod.GET, produces = "application/json")
    public List<MarcaProducto> marcasEmpresaAction(@PathVariable String empresaId) {
        return marcaServices.getMarcasByEmpresaID(empresaId);
    }
}