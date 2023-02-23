package com.example.flashcardsapp.controller;

import com.example.flashcardsapp.model.FlashCardsModel;
import com.example.flashcardsapp.service.FlashCardsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;


@Controller
public class homeController {
    @GetMapping("/question")
    public String getQuestionPage() {
        return "question";
    }

    @GetMapping("/answer")
    public String getAnswerPage(){
        return "answer";
    }
}






