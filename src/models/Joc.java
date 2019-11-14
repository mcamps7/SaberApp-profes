/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author montse
 */
public class Joc {
    
    //Atributs
    Professor professor;
    private String nom;
    private List<Partida> partides;

    public Joc() {
    }

    public Joc(Professor professor, String nom, List<Partida> partides) {
        this.professor = professor;
        this.nom = nom;
        this.partides = partides;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Partida> getPartides() {
        return partides;
    }

    public void setPartides(List<Partida> partides) {
        this.partides = partides;
    }
    
    
    
    
}
