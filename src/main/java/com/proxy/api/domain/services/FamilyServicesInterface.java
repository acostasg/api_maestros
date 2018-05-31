package com.proxy.api.domain.services;

import com.proxy.api.domain.model.FamiliaProducto;
import com.proxy.api.domain.model.SubFamiliaProducto;

import java.util.List;

public interface FamilyServicesInterface {

    List<FamiliaProducto> getAll();

    List<SubFamiliaProducto> getSubFamiliesByFamiliaID(Integer codigoFamilia);
}
