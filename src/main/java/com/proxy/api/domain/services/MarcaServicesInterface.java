package com.proxy.api.domain.services;

import com.proxy.api.domain.model.MarcaProducto;

import java.util.List;

public interface MarcaServicesInterface {

    List<MarcaProducto> getAll();

    List<MarcaProducto> getMarcasByEmpresaID(String codigoEmpresa);
}
