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

    public Jogador(String nome, int level, int inteligencia, int resistencia, int forca, int agilidade, int destreza, int bVida) {
        this.nome = nome;
        this.level = level;
        this.inteligencia = inteligencia;
        this.resistencia = resistencia;
        this.forca = forca;
        this.agilidade = agilidade;
        this.destreza = destreza;
        this.bVida = bVida;
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
