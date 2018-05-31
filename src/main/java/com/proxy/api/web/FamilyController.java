package com.proxy.api.web;

import com.proxy.api.domain.model.FamiliaProducto;
import com.proxy.api.domain.model.SubFamiliaProducto;
import com.proxy.api.domain.services.FamilyServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/familia")
public class FamilyController {

    @Autowired
    private FamilyServicesInterface familyServices;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET, produces = "application/json")
    public List<FamiliaProducto> familiaAction() {
        return familyServices.getAll();
    }

    @RequestMapping(value = {"/{familiaId:.*}/subfamilia", "/{familiaId:.*}/subfamilia/"}, method = RequestMethod.GET, produces = "application/json")
    public List<SubFamiliaProducto> subfamiliaAction(@PathVariable Integer familiaId) {
        return familyServices.getSubFamiliesByFamiliaID(familiaId);
    }
}