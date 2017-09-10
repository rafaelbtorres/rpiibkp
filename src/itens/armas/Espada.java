/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens.armas;

/**
 *
 * @author unipampa
 */
public class Espada extends Armas {

    private int adicionalDano;
    private String nome;

    public int getAdicionalDano() {
        return adicionalDano;
    }

    public void setAdicionalDano(int adicionalDano) {
        this.adicionalDano = adicionalDano;
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
