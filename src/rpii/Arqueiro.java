/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Arco;

/**
 *
 * @author leonardo
 */
public class Arqueiro extends Classe {

    public Arqueiro() {
        this.agilidade = 3;
        this.bVida = 30;
        this.destreza = 5;
        this.forca = 3;
        this.inteligencia = 5;
        this.resistencia = 5;
        this.arma = new Arco();
    }
    
}
