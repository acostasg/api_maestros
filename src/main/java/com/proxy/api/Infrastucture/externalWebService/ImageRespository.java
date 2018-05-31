package com.proxy.api.Infrastucture.externalWebService;

import com.proxy.api.domain.repositories.ImageRepositoryInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Service
@Primary
public class ImageRespository implements ImageRepositoryInterface {

    private static final String IMAGE_URL_PATH = "http://10.26.6.33/imagenes/";

    @Override
    public byte[] getImageByEAN(String EAN) {
        try {
            URL url = new URL(IMAGE_URL_PATH + EAN);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream is = null;
            try {
                is = url.openStream();
                byte[] byteChunk = new byte[4096]; // Or whatever size you want to read in at a time.
                int n;

                while ((n = is.read(byteChunk)) > 0) {
                    baos.write(byteChunk, 0, n);
                }
                return baos.toByteArray();
            } catch (IOException e) {
                System.err.printf("Failed while reading bytes from %s: %s", url.toExternalForm(), e.getMessage());
                e.printStackTrace();
                // Perform any other exception handling that's appropriate.
            } finally {
                if (is != null) {
                    is.close();
                }
            }

        } catch (IOException e) {
            return null;
        }
        return null;
    }
}
