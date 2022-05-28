package com.yaceszen.ap.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String tituloUsuario;
    private String descUsuario;
    private String urlImgUsuario;

    //RELACIONO CON EDUCACION
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducacion")
    private List<Educacion>educacionList;
    //EXPERIENCIA
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperiencia")
    private List<Experiencia>experienciaList;
    //PROYECTOS
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyectos")
    private List<Proyectos>proyectosList;
    //SKILLS
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills>skillsList;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreUsuario, String apellidoUsuario, String tituloUsuario, String descUsuario, String urlImgUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.tituloUsuario = tituloUsuario;
        this.descUsuario = descUsuario;
        this.urlImgUsuario = urlImgUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTituloUsuario() {
        return tituloUsuario;
    }

    public void setTituloUsuario(String tituloUsuario) {
        this.tituloUsuario = tituloUsuario;
    }

    public String getDescUsuario() {
        return descUsuario;
    }

    public void setDescUsuario(String descUsuario) {
        this.descUsuario = descUsuario;
    }

    public String getUrlImgUsuario() {
        return urlImgUsuario;
    }

    public void setUrlImgUsuario(String urlImgUsuario) {
        this.urlImgUsuario = urlImgUsuario;
    }
}
