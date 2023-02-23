package com.example.flashcardsapp.service;

import com.example.flashcardsapp.model.FlashCardsModel;
import com.example.flashcardsapp.repository.FlashCardsRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlashCardsService {
    private final FlashCardsRepo repo;

    public FlashCardsService(FlashCardsRepo repo) {
        this.repo = repo;
    }


    public Optional<FlashCardsModel> getFlashCards(Long id){
       return repo.findById(id);
    }


    public List<FlashCardsModel> getAllFlashCards() {
        return repo.findAll();
    }

    public FlashCardsModel createNewFlashCards(FlashCardsModel newFlashCardsModel) {
        return repo.save(newFlashCardsModel);
    }

    public void deleteFlashCards(Long id) {
        repo.deleteById(id);
    }
    public FlashCardsModel updateFlashCards(Long id, FlashCardsModel updatedFlashCardsModel) {
        Optional<FlashCardsModel> optionalFlashCards = repo.findById(id);
        if (optionalFlashCards.isPresent()) {
            FlashCardsModel flashCardsModel = optionalFlashCards.get();
            flashCardsModel.setTitle(updatedFlashCardsModel.getTitle());
            flashCardsModel.setQuestion(updatedFlashCardsModel.getQuestion());
            flashCardsModel.setAnswer(updatedFlashCardsModel.getAnswer());
            return repo.save(flashCardsModel);
        }
        return null;
    }
}
