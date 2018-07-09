package com.proxy.api.domain.services;

import com.proxy.api.domain.repositories.ImageRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ImagenServices implements ImageServicesInterface {

    @Autowired
    private ImageRepositoryInterface imageRepository;

    @Override
    @Cacheable("images")
    public byte[] getImageByEAN(String EAN) {
        return this.imageRepository.getImageByEAN(EAN);
    }
}
