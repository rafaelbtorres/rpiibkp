/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Cajado;

/**
 *
 * @author leonardo
 */
public class Mago extends Classe {

    public Mago() {
        this.agilidade = 5;
        this.bVida = 20;
        this.destreza = 5;
        this.forca = 1;
        this.inteligencia = 10;
        this.resistencia = 4;
        this.arma = new Cajado();
    }
    
}
