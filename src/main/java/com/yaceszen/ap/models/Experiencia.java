package com.yaceszen.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String nombreExperiencia;
    private int fechaExperiencia;
    private String descExperiencia;
    private String urlImgExperiencia;

    public Experiencia() {
    }
    public Experiencia(Long idExperiencia, String nombreExperiencia, int fechaExperiencia, String descExperiencia, String urlImgExperiencia) {
        this.idExperiencia = idExperiencia;
        this.nombreExperiencia = nombreExperiencia;
        this.fechaExperiencia = fechaExperiencia;
        this.descExperiencia = descExperiencia;
        this.urlImgExperiencia = urlImgExperiencia;
    }

    public Long getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Long idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public int getFechaExperiencia() {
        return fechaExperiencia;
    }

    public void setFechaExperiencia(int fechaExperiencia) {
        this.fechaExperiencia = fechaExperiencia;
    }

    public String getDescExperiencia() {
        return descExperiencia;
    }

    public void setDescExperiencia(String descExperiencia) {
        this.descExperiencia = descExperiencia;
    }

    public String getUrlImgExperiencia() {
        return urlImgExperiencia;
    }

    public void setUrlImgExperiencia(String urlImgExperiencia) {
        this.urlImgExperiencia = urlImgExperiencia;
    }
}
