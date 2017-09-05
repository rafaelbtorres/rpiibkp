package rpii;

import audio.Som;
import static audio.Som.inicio;
import fases.Fase1;
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
            System.out.println("1- Iniciar novo jogo 2- Sair 3- Obter ajuda");
            resp = e.nextInt();
            if (resp > 0 && resp < 4) {
                if (resp == 1) {
                    System.out.println("Digite seu nome, jogador!: ");
                    e.nextLine();
                    nome = e.nextLine();
                    System.out.println("Agora, digite sua idade: ");
                    idade = e.nextInt();
                    Fase1 c = new Fase1(nome, idade);
                    Som.parar(musica);
                    c.Enredo();
                    System.out.println("Você está pronto para começar essa jornada? 1- SIM 2- AINDA NAO");
                    int res = e.nextInt();
                    if (res == 1) {
                     c.ato1();
                    }
                    break;
                }
                if (resp == 2) {

                }
                if (resp == 3) {

                }
            } else {
                System.out.println("Opcao invalida, tente novamente!");
            }
        }
    }
    
}
