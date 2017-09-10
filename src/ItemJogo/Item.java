package ItemJogo;

/**
 *
 * @author vagne
 */
public class Item {
    String descricao;
    TipoItem tipo;
    int Ataque;
    int defesa;
    int velocidade;
    int nivelMinimo;

    public Item(String descricao, TipoItem tipo, int Ataque, int defesa, int velocidade, int nivelMinimo) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.Ataque = Ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.nivelMinimo = nivelMinimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(int nivelMinimo) {
        this.nivelMinimo = nivelMinimo;
    }
}
