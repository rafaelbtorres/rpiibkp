/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Armas;

/**
 *
 * @author unipampa
 */
public abstract class Jogador {

    private String nome;
    private int level;
    private int inteligencia;
    private int resistencia;
    private int forca;
    private int agilidade;
    private int destreza;
    private int bVida;
    private int bVidaAtual;
    private Armas arma;
    

    public Jogador(String nome, Classe classeJogador) {
        this.nome = nome;
        this.level = 1;
        this.inteligencia = classeJogador.getInteligencia();
        this.resistencia = classeJogador.getResistencia();
        this.forca = classeJogador.getForca();
        this.agilidade = classeJogador.getAgilidade();
        this.destreza = classeJogador.getDestreza();
        this.bVida = classeJogador.getbVida();
        this.arma = classeJogador.getArma();
    }

    public abstract int Atacar();

    public abstract void Defender(int dano);

    public abstract boolean Desviar();

    public abstract void AumentoVida();

    public abstract void Especial();

    public abstract void Status();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia the inteligencia to set
     */
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    /**
     * @return the forca
     */
    public int getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * @return the agilidade
     */
    public int getAgilidade() {
        return agilidade;
    }

    /**
     * @param agilidade the agilidade to set
     */
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    /**
     * @return the destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param destreza the destreza to set
     */
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    /**
     * @return the bVida
     */
    public int getbVida() {
        return bVida;
    }

    /**
     * @param bVida the bVida to set
     */
    public void setbVida(int bVida) {
        this.bVida = bVida;
    }

    /**
     * @return the arma
     */
    public Armas getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(Armas arma) {
        this.arma = arma;
        
    }

    /**
     * @return the bVidaAtual
     */
    public int getbVidaAtual() {
        return bVidaAtual;
    }

    /**
     * @param bVidaAtual the bVidaAtual to set
     */
    public void setbVidaAtual(int bVidaAtual) {
        this.bVidaAtual = bVidaAtual;
    }
    
    

}
