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
public class Cajado extends Armas {
    private int adicionalInteligencia;
    private String nome;

    public int getAdicionalInteligencia() {
        return adicionalInteligencia;
    }

    public void setAdicionalInteligencia(int adicionalInteligencia) {
        this.adicionalInteligencia = adicionalInteligencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void ExibirStatus() {
    }
    
    
}
