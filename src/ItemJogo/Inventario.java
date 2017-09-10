package ItemJogo;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Item> itens;
    int capacidade;

    public Inventario(int capacidade) {
        this.capacidade = capacidade;
        this.itens = new ArrayList<>();
    }

    public boolean adicionarItem(Item novoItem) {
        if (getCapacidadeDisponivel() > 0) {
            itens.add(novoItem);
            return true;
        } else {
            return false;
        }
    }

    public void removerItem(int posicao) {
        itens.remove(posicao);
    }

    public ArrayList<Item> pegarTodosItens() {
        return itens;
    }

    public int getCapacidadeDisponivel() {
        return capacidade - itens.size();
    }
}
