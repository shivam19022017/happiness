package com.survey.happiness.controller;

import com.survey.happiness.model.Survey;
import com.survey.happiness.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/survey")
public class SurveyQuestions {
    @Autowired
    SurveyService surveyService;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/add")
    public Survey saveSurvey(@RequestBody Survey survey) {
        return surveyService.saveSurvey(survey);
    }

    @GetMapping("/get")
    public List<Survey> fetchSurvey() {
        return surveyService.getSurvey();
    }
}
