package com.argprog_portfolio.backportfolio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idEdu;

    @Column(nullable=false)
    private Portfolio portfolio;

    @Column(length=100, nullable=false)
    private String certificationTitle;

    @Column(length=100, nullable=false)
    private String educationCenter;

    @Column(length=60, nullable=true)
    private String urlCenterImage;

    @Column(nullable=false)
    private Date startDate;

    @Column(nullable=true)
    private Date endDate;

    @Column(length=400, nullable=false)
    private String certificationDescription;

    public Education() {
    }

    public Education(Long idEdu, Portfolio portfolio, String certificationTitle, String educationCenter,
            String urlCenterImage, Date startDate, Date endDate, String certificationDescription) {
        this.idEdu = idEdu;
        this.portfolio = portfolio;
        this.certificationTitle = certificationTitle;
        this.educationCenter = educationCenter;
        this.urlCenterImage = urlCenterImage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.certificationDescription = certificationDescription;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getCertificationTitle() {
        return certificationTitle;
    }

    public void setCertificationTitle(String certificationTitle) {
        this.certificationTitle = certificationTitle;
    }

    public String getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(String educationCenter) {
        this.educationCenter = educationCenter;
    }

    public String getUrlCenterImage() {
        return urlCenterImage;
    }

    public void setUrlCenterImage(String urlCenterImage) {
        this.urlCenterImage = urlCenterImage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCertificationDescription() {
        return certificationDescription;
    }

    public void setCertificationDescription(String certificationDescription) {
        this.certificationDescription = certificationDescription;
    }

    
}
