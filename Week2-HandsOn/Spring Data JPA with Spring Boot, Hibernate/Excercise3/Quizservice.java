package com.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Question;
import com.quiz.repository.QuestionRepository;

@Service
public class QuizService {

    @Autowired
    private QuestionRepository repository;

    public Question getQuestion(int id) {
        return repository.findById(id).orElse(null);
    }

}
