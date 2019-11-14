/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.ImageIcon;

/**
 *
 * @author montse
 */
public class Alumne extends Usuari {

    private String curs;
    private int puntuacio;

    public Alumne(int id, String nick, String password, String nom, String cognoms, String email, ImageIcon imatge, Institut institut, String materia) {
        super(id, nick, password, nom, cognoms, email, imatge, institut);
        this.curs= curs;
        this.puntuacio = puntuacio;
    }

    public Alumne() {
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public Institut getInstitut() {
        return institut;
    }

    public void setInstitut(Institut institut) {
        this.institut = institut;
    }
    
    
}