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
public class Arco extends Armas{
    private int adicionalDestreza;
    private String nomeArma;

    public int getAdicionalDestreza() {
        return adicionalDestreza;
    }

    public void setAdicionalDestreza(int adicionalDestreza) {
        this.adicionalDestreza = adicionalDestreza;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    @Override
    public void ExibirStatus() {
    }
    
    
}
