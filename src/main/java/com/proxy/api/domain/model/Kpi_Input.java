package com.proxy.api.domain.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "V_Kpi_Inputs", schema = "dbo", catalog = "Realidad_Aumentada")
public class Kpi_Input implements Serializable {

    public static final String tableName = "V_Kpi_Inputs";

    @Id
    @GeneratedValue
    @Column(name = "Codigo_Producto_Mercadona")
    private String codigoProducto;

    @Column(name = "Numero_Inputs_Año_Curso")
    private String numeroInputsEjercicioEnCurso;

    @Column(name = "Tipo_expediente")
    private String tipoExpediente;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNumeroInputsEjercicioEnCurso() {
        return numeroInputsEjercicioEnCurso;
    }

    public void setNumeroInputsEjercicioEnCurso(String numeroInputsEjercicioEnCurso) {
        this.numeroInputsEjercicioEnCurso = numeroInputsEjercicioEnCurso;
    }

    public String getTipoExpediente() {
        return tipoExpediente;
    }

    public void setTipoExpediente(String tipoExpediente) {
        this.tipoExpediente = tipoExpediente;
    }
}
