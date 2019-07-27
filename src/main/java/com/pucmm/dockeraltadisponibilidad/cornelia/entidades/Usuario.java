package com.pucmm.dockeraltadisponibilidad.cornelia.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Usuario implements Serializable {
    @Id
    private String codigo;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String usuario;
    private String contraisenia;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraisenia() {
        return contraisenia;
    }

    public void setContraisenia(String contraisenia) {
        this.contraisenia = contraisenia;
    }
}
