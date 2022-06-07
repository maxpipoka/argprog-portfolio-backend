package com.argprog_portfolio.backportfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idUser;

    @Column(length=1, nullable=false)
    private Long accessLevel = 1L;

    @Column(length=20, nullable=false)
    private String userName;

    @Column(length=20, nullable=false)
    private String userPassword;

    @Column(nullable=false)
    private Portfolio portfolioAccess;

    public User() {
    }

    public User(Long idUser, Long accessLevel, String userName, String userPassword, Portfolio portfolioAccess) {
        this.idUser = idUser;
        this.accessLevel = accessLevel;
        this.userName = userName;
        this.userPassword = userPassword;
        this.portfolioAccess = portfolioAccess;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Long accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Portfolio getPortfolioAccess() {
        return portfolioAccess;
    }

    public void setPortfolioAccess(Portfolio portfolioAccess) {
        this.portfolioAccess = portfolioAccess;
    }

    

}
