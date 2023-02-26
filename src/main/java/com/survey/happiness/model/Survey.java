package com.survey.happiness.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long surveyId;
    String userName;
    Integer happinessMessure;

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getHappinessMessure() {
        return happinessMessure;
    }

    public void setHappinessMessure(Integer happinessMessure) {
        this.happinessMessure = happinessMessure;
    }
}
