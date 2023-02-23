package com.example.flashcardsapp.repository;

import com.example.flashcardsapp.model.FlashCardsModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlashCardsRepo extends JpaRepository<FlashCardsModel,Long>{




}
