package com.company;

public class Etudiant {

    private String nom, prenom, cne;

     int numExam=1; // numero d ' examen

    // la question 5 - a
    private double note1, note2, note3;
    // la question 5 - b
    private boolean inscrModule1, inscrModule2, inscrModule3;

    static  int numeroSuivant = 1;








    // la question 2 - a
    public Etudiant(String nom) {
        this.nom = nom;
        this.numExam = numeroSuivant;
        numeroSuivant++;
    }
    // la question 2 - b
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numExam = numeroSuivant;
        numeroSuivant++;
    }
    // la question 2 - c
    public Etudiant(String nom, String prenom, String cne) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.numExam = numeroSuivant;
        numeroSuivant++;
    }

    public static String getNbEtudiant() {
         numeroSuivant = numeroSuivant - 1;
        return "Nombre d'etudiants : " + numeroSuivant;
    }


    public double moyenne(){
        return (note1 + note2 + note3)/3;
    }

    public String mention(){
        if(inscrModule1 && inscrModule2 && inscrModule3){
            if(moyenne()>=10){
                return "Excellent";
            }else if(moyenne()>=8){
                return "Bien";
            }else if(moyenne()>=6){
                return "Assez Bien";
            }else if(moyenne()>=4){
                return "Passable";
            }else{
                return "Insuffisant";
            }
        }else{
            return "Etudiant non inscrit dans 3 modules";
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public boolean isInscrModule1() {
        return inscrModule1;
    }

    public void setInscrModule1(boolean inscrModule1) {
        this.inscrModule1 = inscrModule1;
    }

    public boolean isInscrModule2() {
        return inscrModule2;
    }

    public void setInscrModule2(boolean inscrModule2) {
        this.inscrModule2 = inscrModule2;
    }

    public boolean isInscrModule3() {
        return inscrModule3;
    }

    public void setInscrModule3(boolean inscrModule3) {
        this.inscrModule3 = inscrModule3;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }
}
