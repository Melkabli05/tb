package com.company;

public class TestEtudian {

    public static void main(String[] args) {

        // la question 4 - a
        Etudiant etudian1 = new Etudiant("Mohammed");
        // la question 4 - b
        Etudiant etudian2 = new Etudiant("Ayoub", "world");
        // la question 4 - c
        Etudiant etudian3 = new Etudiant("Ibtissem", "Sara", "ab123456");

        // la question 4 -
        Etudiant etudian4 = new Etudiant(etudian3.getNom(), etudian3.getPrenom(), etudian3.getCne());

        // 9. Dans la classe « TestEtudiant », affichez le nombre d'étudiants inscrits.



        System.out.println(etudian1.numExam);
        System.out.println(etudian2.numExam);
        System.out.println(etudian3.numExam);

        // la question 6 - a
        etudian1.setInscrModule1(true);
        etudian1.setInscrModule2(true);
        etudian1.setInscrModule3(true);
        // la question 6 - b
        etudian3.setInscrModule1(true);
        etudian3.setInscrModule2(true);
        // la question 6 - c
        etudian4.setInscrModule1(true);




        // la question 7 - l'insertion des notes des estudiant 1 et 3
        etudian1.setNote1(10);
        etudian1.setNote2(7);
        etudian1.setNote3(9);

        etudian3.setNote1(10);
        etudian3.setNote2(5);
        etudian3.setNote3(6);

        // la question 7 - afficher la moyenne des étudiants 1 et 3
        System.out.println("Moyenne de " + etudian1.getNom() + " : " + etudian1.moyenne());
        System.out.println("Moyenne de " + etudian3.getNom() + " : " + etudian3.moyenne());



        // la question 9 - afficher le nombre d'étudiants inscrits
        System.out.println("Nombre d'étudiants inscrits : " + Etudiant.getNbEtudiant());
    }
}
