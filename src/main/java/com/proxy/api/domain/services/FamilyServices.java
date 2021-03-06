package com.proxy.api.domain.services;

import com.proxy.api.domain.model.FamiliaProducto;
import com.proxy.api.domain.model.SubFamiliaProducto;
import com.proxy.api.domain.repositories.FamilyRepositoryInterface;
import com.proxy.api.domain.repositories.SubFamilyRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServices implements FamilyServicesInterface {

    @Autowired
    private FamilyRepositoryInterface familyRepository;

    @Autowired
    private SubFamilyRepositoryInterface subFamilyRepository;

    @Override
    @Cacheable("family")
    public List<FamiliaProducto> getAll() {
        return this.familyRepository.findAll(sortByIdAsc());
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.ASC, "descripcionFamilia");
    }

    @Override
    @Cacheable("subFamily")
    public List<SubFamiliaProducto> getSubFamiliesByFamiliaID(Integer codigoFamilia) {
        return this.subFamilyRepository.findByIdKeySubFamilyCodigoFamiliaOrderByDescripcionSubFamilia(codigoFamilia);
    }
}
