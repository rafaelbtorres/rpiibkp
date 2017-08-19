/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import java.util.Scanner;

/**
 *
 * @author unipampa
 */
public class RPII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n;
        System.out.print("Digite o seu nome: ");
        n = input.nextLine();
        Undead Jogador = new Undead(n, 1, 2, 3, 4, 5, 6, 7);
        UndeadIA Inimigo1 = new UndeadIA("Juarez", 2, 3, 4, 5, 6, 7);
        String acao;
        System.out.println("Voce é o "+n+" e quer saber o seu status, oq vc faz?");
        acao = input.nextLine();
        switch(acao){
            case "status": Jogador.Status();
            case "abrir":
        }
        
    }
    
}
