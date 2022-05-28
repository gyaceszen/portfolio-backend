package com.yaceszen.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyectos;
    private String nombreProyectos;
    private String linkProyectos;
    private String descProyectos;
    private String urlImgProyectos;

    public Proyectos() {
    }

    public Proyectos(Long idProyectos, String nombreProyectos, String linkProyectos, String descProyectos, String urlImgProyectos) {
        this.idProyectos = idProyectos;
        this.nombreProyectos = nombreProyectos;
        this.linkProyectos = linkProyectos;
        this.descProyectos = descProyectos;
        this.urlImgProyectos = urlImgProyectos;
    }

    public Long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Long idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getNombreProyectos() {
        return nombreProyectos;
    }

    public void setNombreProyectos(String nombreProyectos) {
        this.nombreProyectos = nombreProyectos;
    }

    public String getLinkProyectos() {
        return linkProyectos;
    }

    public void setLinkProyectos(String linkProyectos) {
        this.linkProyectos = linkProyectos;
    }

    public String getDescProyectos() {
        return descProyectos;
    }

    public void setDescProyectos(String descProyectos) {
        this.descProyectos = descProyectos;
    }

    public String getUrlImgProyectos() {
        return urlImgProyectos;
    }

    public void setUrlImgProyectos(String urlImgProyectos) {
        this.urlImgProyectos = urlImgProyectos;
    }
}
