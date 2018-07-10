package com.proxy.api.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class IdKeySubFamily implements Serializable {

    @NotNull
    @Column(name = "SUB_ID")
    private Integer codigoSubFamilia;

    @NotNull
    @Column(name = "SUB_CATE_ID")
    private Integer codigoFamilia;

    public IdKeySubFamily() {
    }

    public Integer getCodigoSubFamilia() {
        return codigoSubFamilia;
    }

    public void setCodigoSubFamilia(Integer codigoSubFamilia) {
        this.codigoSubFamilia = codigoSubFamilia;
    }

    public Integer getCodigoFamilia() {
        return codigoFamilia;
    }

    public void setCodigoFamilia(Integer codigoFamilia) {
        this.codigoFamilia = codigoFamilia;
    }
}
