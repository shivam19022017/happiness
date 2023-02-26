package com.survey.happiness.service;

import com.survey.happiness.exception.QuestionNotFoundException;
import com.survey.happiness.model.Question;
import com.survey.happiness.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public Question addQuestions(Question question) throws QuestionNotFoundException {
        if(question.getQid() != null && question.getQid() > 0L){
            Optional<Question> questionById = getQuestionById(question.getQid());
            if(questionById.isEmpty()){
                throw new QuestionNotFoundException("Question Not found");
            }
        }
        return questionRepository.save(question);
    }

    public List<Question> getQuestion(){
        return questionRepository.findAll();
    }

    public Optional<Question> getQuestionById(Long id){
        return questionRepository.findById(id);
    }

}
