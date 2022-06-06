package com.argprog_portfolio.backportfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="portfolio")
public class Portfolio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idPortfolio;

    @Column(length=60, nullable=false)
    private String nameProfessional;
    
    @Column(length=60, nullable=false)
    private String tittleProfessional;

    @Column(length=400, nullable=false)
    private String descriptionProfesional;

    @Column(length=60, nullable=false)
    private String urlImageProfile;

    @Column(nullable=true)
    private String urlGithub;

    @Column(nullable=true)
    private String urlLinkedin;

    @Column(nullable=true)
    private String urlFacebook;

    @Column(nullable=true)
    private String urlTwitter;

    @Column(nullable=true)
    private String urlInstagram;
    
    public Portfolio() {
    }

    public Portfolio(Long idPortfolio, String nameProfessional, String tittleProfessional,
            String descriptionProfesional, String urlImageProfile, String urlGithub, String urlLinkedin,
            String urlFacebook, String urlTwitter, String urlInstagram) {
        this.idPortfolio = idPortfolio;
        this.nameProfessional = nameProfessional;
        this.tittleProfessional = tittleProfessional;
        this.descriptionProfesional = descriptionProfesional;
        this.urlImageProfile = urlImageProfile;
        this.urlGithub = urlGithub;
        this.urlLinkedin = urlLinkedin;
        this.urlFacebook = urlFacebook;
        this.urlTwitter = urlTwitter;
        this.urlInstagram = urlInstagram;
    }

    public Long getIdPortfolio() {
        return idPortfolio;
    }

    public void setIdPortfolio(Long idPortfolio) {
        this.idPortfolio = idPortfolio;
    }

    public String getNameProfessional() {
        return nameProfessional;
    }

    public void setNameProfessional(String nameProfessional) {
        this.nameProfessional = nameProfessional;
    }

    public String getTittleProfessional() {
        return tittleProfessional;
    }

    public void setTittleProfessional(String tittleProfessional) {
        this.tittleProfessional = tittleProfessional;
    }

    public String getDescriptionProfesional() {
        return descriptionProfesional;
    }

    public void setDescriptionProfesional(String descriptionProfesional) {
        this.descriptionProfesional = descriptionProfesional;
    }

    public String getUrlImageProfile() {
        return urlImageProfile;
    }

    public void setUrlImageProfile(String urlImageProfile) {
        this.urlImageProfile = urlImageProfile;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }

    public String getUrlFacebook() {
        return urlFacebook;
    }

    public void setUrlFacebook(String urlFacebook) {
        this.urlFacebook = urlFacebook;
    }

    public String getUrlTwitter() {
        return urlTwitter;
    }

    public void setUrlTwitter(String urlTwitter) {
        this.urlTwitter = urlTwitter;
    }

    public String getUrlInstagram() {
        return urlInstagram;
    }

    public void setUrlInstagram(String urlInstagram) {
        this.urlInstagram = urlInstagram;
    }

    

    
}
