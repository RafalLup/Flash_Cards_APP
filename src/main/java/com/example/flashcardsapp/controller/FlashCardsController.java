package com.example.flashcardsapp.controller;

import com.example.flashcardsapp.model.FlashCardsModel;

import com.example.flashcardsapp.service.FlashCardsService;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class FlashCardsController {

    private final FlashCardsService service;
    static final String BASIC_URL ="/flashCards";


    public FlashCardsController(FlashCardsService service) {
        this.service = service;
    }

@GetMapping(BASIC_URL)
public List<FlashCardsModel> getAllFlashCards(){
        return service.getAllFlashCards();
}
    @GetMapping(BASIC_URL+"/{id}")
    public Optional<FlashCardsModel> getFlashCardsById(@PathVariable Long id){
return service.getFlashCards(id);
    }
    @PostMapping(BASIC_URL)
    public FlashCardsModel createNewFlashCards(@RequestBody FlashCardsModel newFlashCardsModel){
        return service.createNewFlashCards(newFlashCardsModel);
    }
    @DeleteMapping(BASIC_URL+"/{id}")
    public void deleteFlashCards(@PathVariable Long id){
        service.deleteFlashCards(id);
    }
    @PutMapping(BASIC_URL +"/{id}")
    public Optional<FlashCardsModel> updateFlashCardsById(@PathVariable Long id,@RequestBody FlashCardsModel updateflashCardsModel){
      return Optional.ofNullable(service.updateFlashCards(id, updateflashCardsModel));
    }


}
