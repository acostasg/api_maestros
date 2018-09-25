package com.proxy.api.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class IdKeyVentasMensuales implements Serializable {

    @NotNull
    @Column(name = "Codigo_Producto")
    private String codigoProducto;

    @NotNull
    @Column(name = "Fecha")
    private Date fecha;

    public IdKeyVentasMensuales() {
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
