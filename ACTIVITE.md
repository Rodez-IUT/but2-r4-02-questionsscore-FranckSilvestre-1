# R4-02 Qualité de développement - QuestionsScore

## 0. Modification du fichier README

Clonez votre projet Github dans un dossier de travail sur votre machine.
Modifiez le fichier README avec vos nom, prénom et groupe.

> fix #0 Fichier README OK

## 1. Couverture du code par les tests de la classe QuestionAChoixExclusif (en mode Kata)

- Étudiez la structure et le code présent dans le projet.
- Créez la classe de test unitaire permettant de tester la classe *QuestionAChoixExclusif*.
- Écrivez les tests unitaires permettant de couvrir le code de la classe *QuestionAChoixExclusif* à 100%.

> fix #1 Tests sur QuestionAChoixExclusif

## 2. Couverture du code par les tests de la classe QuestionAChoixMultiple 

- Créez la classe de test unitaire permettant de tester la classe *QuestionAChoixMuliple*.
- Écrivez les tests unitaires permettant de couvrir le code de la classe *QuestionAChoixMultiple* à 100%.

> fix #2 Tests sur QuestionAChoixMultiple

## 3. Couverture du code par les tests de la classe ScoreCalculateur 

- Créez la classe de test unitaire permettant de tester la classe *ScoreCalculateur*.
- Écrivez les tests unitaires permettant de couvrir le code de la classe *ScoreCalculateur* à 100% en utilisant la contrainte et les cas de tests suivants :
    - pour chaque cas de test, l'instance de *ScoreCalculateur* utilisée est testée sur une question de type *QuestionAChoixMultiple* initialisée de la
     manière suivante :
    `questionAChoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));`
    - quand on calcule le score pour une liste de réponses contenant les valeurs 1 et 4, on obtient 0 comme résultat ;
    - quand on calcule le score pour une liste de réponses contenant les valeurs 2 et 3, on obtient 2*100/3 à 0,01 près comme résultat ;
    - quand on calcule le score pour une liste de réponses contenant les valeurs 2, 3 et 5, on obtient 100 à 0,01 près comme résultat.

> fix #3 Tests sur ScoreCalculateur

## 4. Correction de l'application

- Complétez les tests unitaires permettant de couvrir le code de la classe *ScoreCalculateur* en utilisant les cas de test suivants :
    - quand on calcule le score pour une liste de réponses contenant les valeurs 1,2,3,4,5 on obtient 0 à 0,01 près comme résultat ;
    - quand on calcule le score pour une liste de réponses contenant les valeurs 1,2 et 3 on obtient 16.66 à 0,01 près comme résultat ;
- Après avoir constaté que ces tests ne passaient pas, modifiez le code de l'application et des tests (si nécessaire) afin que **tous les tests passent**. (Conseil : assurez-vous que vos modifications ne créent pas de nouvelles erreurs Checkstyle.)

> fix #4 Correction application

