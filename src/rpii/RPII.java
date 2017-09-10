package rpii;

import audio.Som;
import static audio.Som.inicio;
import atos.Ato1;
import atos.Ato2;
import java.util.Scanner;
import sun.audio.AudioStream;
public class RPII {

    public static void main(String args[]) throws Exception {
        AudioStream musica = inicio();
        Scanner e = new Scanner(System.in);
        int resp, idade;
        String nome;
        resp = 0;
        System.out.println("Bem vindo ao MUD, Oque deseja fazer? ");
        while (resp != 1 || resp != 2 || resp != 3) {
            System.out.println("1- Iniciar novo jogo 2- Escolher onde comecar o jogo 3- Obter ajuda");
            resp = e.nextInt();
            if (resp > 0 && resp < 4) {
                if (resp == 1) {
                    System.out.println("Digite seu nome, jogador!: ");
                    e.nextLine();
                    nome = e.nextLine();
                    System.out.println("Agora, digite sua idade: ");
                    idade = e.nextInt();
                    Ato1 c = new Ato1(nome, idade);
                    Som.parar(musica);
                    c.Enredo_1();
                    System.out.println("Você está pronto para começar essa jornada? 1- SIM 2- AINDA NAO");
                    int res = e.nextInt();
                    if (res == 1) {
                     c.fase_1();
                    }
                    break;
                }
                if (resp == 2) {
                    while (resp != 1 || resp != 2 || resp != 3) {
                    System.out.println("1-Iniciar no Ato1   2-Iniciar no Ato2   3-Iniciar no Ato3");
                    resp = e.nextInt();
                    if(resp==1){
                        System.out.println("Digite seu nome, jogador!: ");
                        e.nextLine();
                        nome = e.nextLine();
                        System.out.println("Agora, digite sua idade: ");
                        idade = e.nextInt();
                        Ato1 c = new Ato1(nome, idade);
                        Som.parar(musica);
                        c.Enredo_1();
                        break;
                    }
                    if(resp==2){
                        System.out.println("Digite seu nome, jogador!: ");
                        String nomes = e.nextLine();
                        Ato2 c = new Ato2(nomes);
                        Som.parar(musica);
                        c.Enredo_2();
                        break;
                    } 
                    System.out.println("Opcao invalida, tente novamente!\n"
                            + "1-Iniciar no Ato1   2-Iniciar no Ato2   3-Iniciar no Ato3");
                    resp = e.nextInt();
                    }
                    break;
                }
                if (resp == 3) {
                    break;
                }
            }
        System.out.println("Opcao invalida, tente novamente!\n"
                + "1- Iniciar novo jogo 2- Escolher onde comecar o jogo 3- Obter ajuda");
        resp = e.nextInt();
        }
    }
    
}
