package entities;

public class Arma extends Item {
    private int bonusAtaque;

    public Arma(String nome, int preco, int bonusAtaque) {
        super(nome, preco);
        this.bonusAtaque = bonusAtaque;
    }

    public int getBonusAtaque() {
        return bonusAtaque;
    }

    @Override
    public void usar() {
        System.out.printf("Você equipou %s! Ataque aumentado em +%d.%n", getNome(), bonusAtaque);
    }

    @Override
    public String toString() {
        return String.format("[Arma] %s (+%d Ataque) - %d ouro", getNome(), bonusAtaque, getPreco());
    }
}