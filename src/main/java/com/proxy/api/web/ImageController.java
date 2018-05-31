package com.proxy.api.web;

import com.proxy.api.domain.services.ImageServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageServicesInterface imageServices;

    @RequestMapping(value = "/get/{imageId:.*}", method = RequestMethod.GET, produces = "image/png")
    public byte[] imageByEanAction(@PathVariable String imageId) {
        try {
            return imageServices.getImageByEAN(imageId);
        } catch (Exception e) {
            return new byte[0];
        }
    }
}