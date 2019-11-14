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
public class Pregunta {
    
    //Atributs
    Partida partida;
    private String enunciat;
    private String correccio;
    private String urlImatge;
    private List<Resposta> respostes;
    
    
    //Constructor
    public Pregunta(){
        
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public String getEnunciat() {
        return enunciat;
    }

    public void setEnunciat(String enunciat) {
        this.enunciat = enunciat;
    }

    public String getCorreccio() {
        return correccio;
    }

    public void setCorreccio(String correccio) {
        this.correccio = correccio;
    }

    public String getUrlImatge() {
        return urlImatge;
    }

    public void setUrlImatge(String urlImatge) {
        this.urlImatge = urlImatge;
    }

    public List<Resposta> getRespostes() {
        return respostes;
    }

    public void setRespostes(List<Resposta> respostes) {
        this.respostes = respostes;
    }
    
    
}
