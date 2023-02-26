package com.survey.happiness.controller;

import com.survey.happiness.exception.QuestionNotFoundException;
import com.survey.happiness.model.Question;
import com.survey.happiness.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/question")
@CrossOrigin("http://localhost:4200")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping("/add")
    public void addQuestion(@RequestBody Question question) throws QuestionNotFoundException {
        questionService.addQuestions(question);
    }

    @GetMapping("/list")
    public List<Question> fetchQuestion(){
        return questionService.getQuestion();
    }
    @GetMapping("/get")
    public String fetchQuestion2(){
        return "questionService.getQuestion();";
    }
}
