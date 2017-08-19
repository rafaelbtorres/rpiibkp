/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

/**
 *
 * @author unipampa
 */
public abstract class Jogador {
    
    protected String nome;
    protected int level;
    protected int inteligencia;
    protected int resistencia;
    protected int forca;
    protected int agilidade;
    protected int destreza;
    protected int bVida;

    public Jogador(String nome, Classe classeJogador) {
        this.nome = nome;
        this.level = 1;
        this.inteligencia = classeJogador.getInteligencia();
        this.resistencia = classeJogador.getResistencia();
        this.forca = classeJogador.getForca();
        this.agilidade = classeJogador.getAgilidade();
        this.destreza = classeJogador.getDestreza();
        this.bVida = classeJogador.getbVida();
    }
    

     public abstract void Atacar();
     public abstract void Defender();
     public abstract void Fugir(); //tentar fugir
     public abstract void Desviar();
     public abstract void ReducaoVida();
     public abstract void AumentoVida();
     public abstract void Especial();
     public abstract void Status();
}
