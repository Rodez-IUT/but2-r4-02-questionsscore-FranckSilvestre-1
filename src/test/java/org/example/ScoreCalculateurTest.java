package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCalculateurTest {

    private QuestionAChoixMultiple questionAChoixMultiple;

    @BeforeEach
    void setUp() {
        questionAChoixMultiple = new QuestionAChoixMultiple("q1", List.of(2,3,5));
    }

    @Test
    @DisplayName("Test du score pour une liste de réponses contenant des valeurs incorrectes")
    void calculeScorePourValeursIncorrectes() {
        // given : une instance de ScoreCalculateur
        ScoreCalculateur scoreCalculateur = new ScoreCalculateur();
        // et une liste de réponses contenant les valeurs 1 et 4
        List<Integer> reponses = List.of(1, 4);
        // et la question à choix multiple initialisée de la manière suivante :
        // les choix 2,3 et 5 sont les bonnes réponses
        // when : on demande le score pour cette liste de réponses
        float score = scoreCalculateur.calculeScore(reponses, questionAChoixMultiple);
        // then : le score obtenu doit être 0
        assertEquals(0, score, 0.01f);
    }

    @Test
    @DisplayName("Test du score pour une liste de réponses contenant les valeurs correctes 2 et 3")
    void calculeScorePourValeursCorrectes() {
        // given : une instance de ScoreCalculateur
        ScoreCalculateur scoreCalculateur = new ScoreCalculateur();
        // et une liste de réponses contenant les valeurs 2 et 3
        List<Integer> reponses = List.of(2, 3);
        // et la question à choix multiple initialisée de la manière suivante :
        // les choix 2,3 et 5 sont les bonnes réponses
        // when : on demande le score pour cette liste de réponses
        float score = scoreCalculateur.calculeScore(reponses, questionAChoixMultiple);
        // then : le score obtenu doit être 2*100/3
        assertEquals(2*100/3f, score, 0.01f);
    }

    @Test
    @DisplayName("Test du score pour une liste de réponses contenant les valeurs correctes 2, 3 et 5")
    void calculeScorePourToutesLesValeursCorrectes() {
        // given : une instance de ScoreCalculateur
        ScoreCalculateur scoreCalculateur = new ScoreCalculateur();
        // et une liste de réponses contenant les valeurs 2, 3 et 5
        List<Integer> reponses = List.of(2, 3, 5);
        // et la question à choix multiple initialisée de la manière suivante :
        // les choix 2,3 et 5 sont les bonnes réponses
        // when : on demande le score pour cette liste de réponses
        float score = scoreCalculateur.calculeScore(reponses, questionAChoixMultiple);
        // then : le score obtenu doit être 100
        assertEquals(100, score, 0.01f);
    }
}