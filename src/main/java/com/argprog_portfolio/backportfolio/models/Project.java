package com.argprog_portfolio.backportfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idProject;

    @Column(nullable =false)
    private Portfolio portfolio;
    
    @Column(length=60, nullable=false)
    private String projectName;

    @Column(length=400, nullable=false)
    private String projectDescription;

    @Column(nullable=true)
    private String urlProjectImage;

    @Column(length=60, nullable=true)
    private String projectLing;

    public Project() {
    }

    public Project(Long idProject, Portfolio portfolio, String projectName, String projectDescription,
            String urlProjectImage, String projectLing) {
        this.idProject = idProject;
        this.portfolio = portfolio;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.urlProjectImage = urlProjectImage;
        this.projectLing = projectLing;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getUrlProjectImage() {
        return urlProjectImage;
    }

    public void setUrlProjectImage(String urlProjectImage) {
        this.urlProjectImage = urlProjectImage;
    }

    public String getProjectLing() {
        return projectLing;
    }

    public void setProjectLing(String projectLing) {
        this.projectLing = projectLing;
    }

    

}
