package com.survey.happiness.service;

import com.survey.happiness.model.Survey;
import com.survey.happiness.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    @Autowired
    SurveyRepository surveyRepository;

    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);

    }

    public List<Survey> getSurvey() {
        return surveyRepository.findAll();
    }
}
