package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionAChoixExclusifTest {

    @Test
    @DisplayName("Test du score pour un indice correspondant à la bonne réponse")
    void getScoreForIndiceBonneReponse() {
        // given: une question à choix exclusif dont l'indice correct est 1
        QuestionAChoixExclusif question = new QuestionAChoixExclusif("un énoncé", 1);
        // when: on demande le score pour l'indice 1
        float score = question.getScoreForIndice(1);
        // then: le score obtenu est 100
        assertEquals(100, score, 0.01f);
    }

    @Test
    @DisplayName("Test du score pour un indice correspondant une mauvaise réponse")
    void getScoreForIndiceMauvaiseReponse() {
        // given: une question à choix exclusif dont l'indice correct est 1
        QuestionAChoixExclusif question = new QuestionAChoixExclusif("un énoncé", 1);
        // when: on demande le score pour l'indice 1
        float score = question.getScoreForIndice(2);
        // then: le score obtenu est 0
        assertEquals(0, score, 0.01f);
    }

    @Test
    @DisplayName("Test de l'initialisation de la question")
    void testInitialisationEnonce() {
        // given: une question à choix exclusif
        QuestionAChoixExclusif question = new QuestionAChoixExclusif("un énoncé", 1);

        // when: on demande l'énoncé de la question
        String enonce = question.getEnonce();
        // then: l'énoncé retourné est celui fourni à la construction
        assertEquals("un énoncé", enonce);

    }

}