/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raca;

import itens.armas.Arco;
import itens.armas.Cajado;
import itens.armas.Espada;
import java.util.Random;
import rpii.Classe;
import rpii.Jogador;

/**
 *
 * @author unipampa
 */
public class Elfo extends Jogador {

    public Elfo(String nome, Classe classeJogador) {
        super(nome, classeJogador);
    }

    @Override
    public int Atacar() {
        if (this.getArma() instanceof Cajado) {
            return getArma().getDano();
        } else if (this.getArma() instanceof Espada) {
            return getArma().getDano();
        } else if (this.getArma() instanceof Arco) {
            return getArma().getDano() * Integer.parseInt("1.5") + this.getDestreza();
        }
        return 0;
    }

    @Override
    public void Defender(int dano) {
        int x = dano - this.getResistencia();
        if (x > 0) {
            this.setbVidaAtual(x);
            this.setResistencia(0);
        } else {
            this.setResistencia(x * -1);
        }
    }

    @Override
    public boolean Desviar() {
        Random x = new Random();
        if (x.nextDouble() < 0.25) {
            return true;
        }
        return false;
    }

    @Override
    public void AumentoVida() {
    }

    @Override
    public void Especial() {

    }

    @Override
    public void Status() {
    }

}
