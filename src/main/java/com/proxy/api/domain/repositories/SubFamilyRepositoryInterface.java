package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.IdKeySubFamily;
import com.proxy.api.domain.model.SubFamiliaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubFamilyRepositoryInterface extends JpaRepository<SubFamiliaProducto, IdKeySubFamily> {

    List<SubFamiliaProducto> findByIdKeySubFamilyCodigoFamiliaOrderByDescripcionSubFamilia(Integer codigoFamilia);

}
