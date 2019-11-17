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

    private int curs;
    private int puntuacio, num_partides_jugades;

    public Alumne(int id, String nick, String password, String nom, String cognoms, String email, ImageIcon imatge, String institut, int curs) {
        super(id, nick, password, nom, cognoms, email, imatge, institut);
        this.curs= curs;
        this.puntuacio = puntuacio;
        this.num_partides_jugades = num_partides_jugades;
    }
    
    public Alumne(String nick, String password, String email){
        
    }

    public Alumne() {
    }

    public Alumne(int id, String nick, String password, String nom, String cognoms, String email, String institut, int curs, int punts, int numParticipacions) {
        super(id, nick, password, nom, cognoms, email, institut);
        this.curs= curs;
        this.puntuacio = punts;
        this.num_partides_jugades = numParticipacions;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public String getInstitut() {
        return institut;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public int getNum_partides_jugades() {
        return num_partides_jugades;
    }

    public void setNum_partides_jugades(int num_partides_jugades) {
        this.num_partides_jugades = num_partides_jugades;
    }
    
    
}