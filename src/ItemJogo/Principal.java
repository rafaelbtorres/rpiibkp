/**
 *
 * @author vagne
 */ // implementar manipulações no inventário / pegar arma do chão e jogar fora / usar potion / história / trocar de armas
package ItemJogo;

public class Principal {

    public static void main(String args[]) {

        //Criando um inventario de 5 lugares
        Inventario mochila = new Inventario(5);

        //Criando meus itens OBS: ARMADURA tem velocidade e ataque = 0
        Item minhaEspada = new Item("Primeira Espada", TipoItem.ESPADA, 24, 12, 30, 1);
        Item minhaEspada2 = new Item("Segunda Espada", TipoItem.ESPADA, 30, 15, 30, 2);
        Item minhaEspada3 = new Item("Terceira Espada", TipoItem.ESPADA, 35, 18, 30, 3);
        Item meuCajado = new Item("Primeiro Cajado", TipoItem.CAJADO, 28, 0, 30, 1);
        Item meuCajado2 = new Item("Segundo Cajado", TipoItem.CAJADO, 33, 0, 30, 2);
        Item meuCajado3 = new Item("Terceiro Cajado", TipoItem.CAJADO, 40, 0, 30, 3);
        Item meuArco = new Item("Primeiro Arco", TipoItem.ARCO, 24, 3, 32, 1);
        Item meuArco2 = new Item("Segundo Arco", TipoItem.ARCO, 29, 5, 32, 2);
        Item meuArco3 = new Item("Terceiro Arco", TipoItem.ARCO, 35, 7, 32, 3);
        Item minhaArmadura = new Item("Primeira Armadura", TipoItem.ARMADURA, 0, 10, 0, 1);
        Item minhaArmadura2 = new Item("Segunda Armadura", TipoItem.ARMADURA, 0, 20, 0, 2);
        Item minhaArmadura3 = new Item("Terceira Armadura", TipoItem.ARMADURA, 0, 30, 0, 3);

        // Adicionando os itens na mochila
        if (mochila.adicionarItem(minhaEspada)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(minhaEspada2)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(minhaEspada3)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }

// ------------------------ CAJADOS --------------------------
        if (mochila.adicionarItem(meuCajado)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(meuCajado2)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(meuCajado3)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
// ------------------------ ARCOS --------------------------  

        if (mochila.adicionarItem(meuArco)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(meuArco2)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(meuArco3)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
// ------------------------ ARMADURAS --------------------------  
        if (mochila.adicionarItem(minhaArmadura)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(minhaArmadura2)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }
        if (mochila.adicionarItem(minhaArmadura3)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("A sua mochila está cheia!");
        }

    }
}
