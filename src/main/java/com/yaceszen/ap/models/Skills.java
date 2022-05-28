package com.yaceszen.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private String urlImgSkill;
    private String porcentajeSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, String urlImgSkill, String porcentajeSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.urlImgSkill = urlImgSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getUrlImgSkill() {
        return urlImgSkill;
    }

    public void setUrlImgSkill(String urlImgSkill) {
        this.urlImgSkill = urlImgSkill;
    }

    public String getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(String porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }
}
