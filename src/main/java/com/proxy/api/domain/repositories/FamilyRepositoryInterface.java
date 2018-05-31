package com.proxy.api.domain.repositories;

import com.proxy.api.domain.model.FamiliaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepositoryInterface extends JpaRepository<FamiliaProducto, Integer> {

}
