package com.proxy.api.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class IdKeyPrecioVenta implements Serializable {

    @NotNull
    @Column(name = "Codigo_Producto")
    private String codigoProducto;

    @NotNull
    @Column(name = "Tipo_Tarifa")
    private String tipoTarifa;

    public IdKeyPrecioVenta() {
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

}
