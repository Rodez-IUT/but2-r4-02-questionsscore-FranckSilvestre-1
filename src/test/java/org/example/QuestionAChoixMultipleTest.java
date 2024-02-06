package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionAChoixMultipleTest {
    private QuestionAChoixMultiple questionDeuxBonnesReponses;

    @BeforeEach
    void setUp() {
        questionDeuxBonnesReponses = new QuestionAChoixMultiple(
                "Cochez les assertions vraies.",
                List.of(1, 3));
    }

    @Test
    @DisplayName("Test de la méthode getScoreForIndice pour deux choix corrects")
    void getScoreForIndiceDeuxBonnesReponses() {
        // when : on demande le score pour l'indice 1
        float scorePour1 = questionDeuxBonnesReponses.getScoreForIndice(1);
        // then : le score obtenu doit être 50
        assertEquals(50f, scorePour1, "Le score pour l'indice 1 doit être 50");
        // when : on demande le score pour l'indice 3
        float scorePour3 = questionDeuxBonnesReponses.getScoreForIndice(3);
        // then : le score obtenu doit être 50
        assertEquals(50f, scorePour3, "Le score pour l'indice 3 doit être 50");
    }

    @Test
    @DisplayName("Test de la méthode getScoreForIndice pour trois choix corrects")
    void getScoreForIndiceTroisBonnesReponses() {
        // given : une instance de QuestionAChoixMultiple avec comme bonnes réponses les indices 1, 2 et 3
        QuestionAChoixMultiple question = new QuestionAChoixMultiple(
                "Cochez les assertions vraies.",
                List.of(1, 2, 3));
        // when : on demande le score pour l'indice 1
        float scorePour1 = question.getScoreForIndice(1);
        // then : le score obtenu doit être 33.33
        assertEquals(33.33f, scorePour1, 0.01f, "Le score pour l'indice 1 doit être 33.33");
        // when : on demande le score pour l'indice 2
        float scorePour2 = question.getScoreForIndice(2);
        // then : le score obtenu doit être 33.33
        assertEquals(33.33f, scorePour2, 0.01f, "Le score pour l'indice 2 doit être 33.33");
        // when : on demande le score pour l'indice 3
        float scorePour3 = question.getScoreForIndice(3);
        // then : le score obtenu doit être 33.33
        assertEquals(33.33f, scorePour3, 0.01f, "Le score pour l'indice 3 doit être 33.33");
    }

    @Test
    @DisplayName("Test de la méthode getScoreForIndice pour des choix incorrects")
    void getScoreForIndiceMauvaisesReponses() {
        // when : on demande le score pour l'indice 2
        float scorePour2 = questionDeuxBonnesReponses.getScoreForIndice(  2);
        // then : le score obtenu doit être 0
        assertEquals(0f, scorePour2, "Le score pour l'indice 2 doit être 0");
        // when : on demande le score pour l'indice 4
        float scorePour4 = questionDeuxBonnesReponses.getScoreForIndice(4);
        // then : le score obtenu doit être 0
        assertEquals(0f, scorePour4, "Le score pour l'indice 4 doit être 0");
    }

    @Test
    @DisplayName("Test de l'initialisation de la question")
    void testInitialisationEnonce() {
        // when: on demande l'énoncé de la question
        String enonce = questionDeuxBonnesReponses.getEnonce();
        // then: l'énoncé retourné est celui fourni à la construction
        assertEquals("Cochez les assertions vraies.", enonce);

    }

}