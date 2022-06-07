package com.argprog_portfolio.backportfolio.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idExp;

    @Column(nullable=false)
    private Portfolio portfolio;

    @Column(length=60, nullable=false)
    private String workPlace;

    @Column(length=60, nullable=false)
    private String positionTitle;

    @Column(length=60, nullable=true)
    private String urlWorkImage;

    @Column(nullable=false)
    private Date startDate;

    @Column(nullable=true)
    private Date endDate;

    @Column(length=400, nullable=false)
    private String positionDescription;

    public Experience() {
    }

    public Experience(Long idExp, Portfolio portfolio, String workPlace, String positionTitle, String urlWorkImage,
            Date startDate, Date endDate, String positionDescription) {
        this.idExp = idExp;
        this.portfolio = portfolio;
        this.workPlace = workPlace;
        this.positionTitle = positionTitle;
        this.urlWorkImage = urlWorkImage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.positionDescription = positionDescription;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getUrlWorkImage() {
        return urlWorkImage;
    }

    public void setUrlWorkImage(String urlWorkImage) {
        this.urlWorkImage = urlWorkImage;
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

    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }


}
