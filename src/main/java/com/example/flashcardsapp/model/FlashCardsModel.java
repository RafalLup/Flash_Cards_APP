package com.example.flashcardsapp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FlashCardsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    @Size(min = 3, max = 200)
    String title;
    @NotNull
    @Size(min = 3, max = 550)
    String question;
    @NotNull
    @Size(min = 3, max = 550)
    String answer;

}
