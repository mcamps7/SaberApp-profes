/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author montse
 */
public class Partida {
    
    //atributs
    Joc joc;
    private int num_jornada;
    private Date data_inici;
    private Date data_final;
    private List<Pregunta> preguntes;

    public Partida() {
    }
    
    public Partida(Joc joc, int num_jornada, Date data_inici, Date data_final, List<Pregunta> preguntes) {
        this.joc = joc;
        this.num_jornada = num_jornada;
        this.data_inici = data_inici;
        this.data_final = data_final;
        this.preguntes = preguntes;
    }

    public Partida(int i, Date ini, Date fi) {
        this.num_jornada = i;
        this.data_inici = ini;
        this.data_final = fi;
        
    }

    public Joc getJoc() {
        return joc;
    }

    public void setJoc(Joc joc) {
        this.joc = joc;
    }

    public int getNum_jornada() {
        return num_jornada;
    }

    public void setNum_jornada(int num_jornada) {
        this.num_jornada = num_jornada;
    }

    public Date getData_inici() {
        return data_inici;
    }

    public void setData_inici(Date data_inici) {
        this.data_inici = data_inici;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public List<Pregunta> getPreguntes() {
        return preguntes;
    }

    public void setPreguntes(List<Pregunta> preguntes) {
        this.preguntes = preguntes;
    }
    
    
    
    
    
}
