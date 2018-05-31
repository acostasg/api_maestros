package com.proxy.api.domain.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepositoryInterface {

    byte[] getImageByEAN(String EAN);
}
