package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionAChoixMultipleTest {

    @Test
    @DisplayName("Test de la méthode getScoreForIndice pour des choix corrects")
    void getScoreForIndiceBonnesReponses() {
        // given : une instance de QuestionAChoixMultiple avec comme bonnes réponses les indices 1 et 3
        QuestionAChoixMultiple question = new QuestionAChoixMultiple(
                "Cochez les assertions vraies.",
                List.of(1, 3));
        // when : on demande le score pour l'indice 1
        float scorePour1 = question.getScoreForIndice(1);
        // then : le score obtenu doit être 50
        assertEquals(50f, scorePour1, "Le score pour l'indice 1 doit être 50");
        // when : on demande le score pour l'indice 3
        float scorePour3 = question.getScoreForIndice(3);
        // then : le score obtenu doit être 50
        assertEquals(50f, scorePour3, "Le score pour l'indice 3 doit être 50");
    }

    @Test
    @DisplayName("Test de la méthode getScoreForIndice pour des choix incorrects")
    void getScoreForIndiceMauvaisesReponses() {
        // given : une instance de QuestionAChoixMultiple avec comme bonnes réponses les indices 1 et 3
        QuestionAChoixMultiple question = new QuestionAChoixMultiple(
                "Cochez les assertions vraies.",
                List.of(1, 3));
        // when : on demande le score pour l'indice 2
        float scorePour2 = question.getScoreForIndice(  2);
        // then : le score obtenu doit être 0
        assertEquals(0f, scorePour2, "Le score pour l'indice 2 doit être 0");
        // when : on demande le score pour l'indice 4
        float scorePour4 = question.getScoreForIndice(4);
        // then : le score obtenu doit être 0
        assertEquals(0f, scorePour4, "Le score pour l'indice 4 doit être 0");
    }

    @Test
    @DisplayName("Test de l'initialisation de la question")
    void testInitialisationEnonce() {
        // given : une instance de QuestionAChoixMultiple avec comme bonnes réponses les indices 1 et 3
        QuestionAChoixMultiple question = new QuestionAChoixMultiple(
                "Cochez les assertions vraies.",
                List.of(1, 3));
        // when: on demande l'énoncé de la question
        String enonce = question.getEnonce();
        // then: l'énoncé retourné est celui fourni à la construction
        assertEquals("Cochez les assertions vraies.", enonce);

    }

}