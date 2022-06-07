package com.argprog_portfolio.backportfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idSkill;

    @Column(nullable=false)
    private Portfolio portfolio;

    @Column(length=60, nullable=false)
    private String skillName;

    @Column(nullable=false)
    private Long skillLevel = 0L;

    @Column(nullable=true)
    private String urlSkillImage;

    public Skill() {
    }

    public Skill(Long idSkill, Portfolio portfolio, String skillName, Long skillLevel, String urlSkillImage) {
        this.idSkill = idSkill;
        this.portfolio = portfolio;
        this.skillName = skillName;
        this.skillLevel = skillLevel;
        this.urlSkillImage = urlSkillImage;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Long getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(Long skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getUrlSkillImage() {
        return urlSkillImage;
    }

    public void setUrlSkillImage(String urlSkillImage) {
        this.urlSkillImage = urlSkillImage;
    }

    
    
}
