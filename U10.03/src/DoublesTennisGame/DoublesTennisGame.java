/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublesTennisGame;

import TennisGame.TennisGame;

/**
 *
 * @author Jose Luis Perez
 */
public class DoublesTennisGame extends TennisGame{

    private String socio1;
    private String socio2;
    
    public void setJugadores(String socio1, String socio2){
        super.setJugadores("Jose", "Luis");
        this.socio1 = socio1;
        this.socio2 = socio2;
    }
    
    public String getSocio1() {
        return socio1; 
    }
    
    public String getSocio2() {
        return socio2;
    }
}