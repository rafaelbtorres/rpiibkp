/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Espada;

/**
 *
 * @author leonardo
 */
public class Guerreiro extends Classe {

    public Guerreiro() {
        this.agilidade = 3;
        this.bVida = 50;
        this.destreza = 5;
        this.forca = 10;
        this.inteligencia = 3;
        this.resistencia = 7;
        this.arma = new Espada();
    }
    
}
