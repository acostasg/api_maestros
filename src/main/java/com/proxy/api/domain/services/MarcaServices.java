package com.proxy.api.domain.services;

import com.proxy.api.domain.model.MarcaProducto;
import com.proxy.api.domain.repositories.MarcaRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServices implements MarcaServicesInterface {

    @Autowired
    private MarcaRepositoryInterface marcaRepository;

    @Override
    @Cacheable("marcas")
    public List<MarcaProducto> getAll() {
        return this.marcaRepository.findAll(sortByIdAsc());
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.ASC, "descripcionMarca");
    }

    @Override
    @Cacheable("marcasEmpresa")
    public List<MarcaProducto> getMarcasByEmpresaID(String codigoEmpresa) {
        return this.marcaRepository.getByEmpresaId(codigoEmpresa);
    }
}
