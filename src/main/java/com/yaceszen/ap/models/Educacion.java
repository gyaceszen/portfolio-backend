package com.yaceszen.ap.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducacion;
    private String nombreInstEducacion;
    private String linkEducacion;
    private String descEducacion;
    private String urlImgEducacion;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String nombreInstEducacion, String linkEducacion, String descEducacion, String urlImgEducacion) {
        this.idEducacion = idEducacion;
        this.nombreInstEducacion = nombreInstEducacion;
        this.linkEducacion = linkEducacion;
        this.descEducacion = descEducacion;
        this.urlImgEducacion = urlImgEducacion;
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getNombreInstEducacion() {
        return nombreInstEducacion;
    }

    public void setNombreInstEducacion(String nombreInstEducacion) {
        this.nombreInstEducacion = nombreInstEducacion;
    }

    public String getLinkEducacion() {
        return linkEducacion;
    }

    public void setLinkEducacion(String linkEducacion) {
        this.linkEducacion = linkEducacion;
    }

    public String getDescEducacion() {
        return descEducacion;
    }

    public void setDescEducacion(String descEducacion) {
        this.descEducacion = descEducacion;
    }

    public String getUrlImgEducacion() {
        return urlImgEducacion;
    }

    public void setUrlImgEducacion(String urlImgEducacion) {
        this.urlImgEducacion = urlImgEducacion;
    }
}
