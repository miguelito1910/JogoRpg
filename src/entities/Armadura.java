package entities;

public class Armadura extends Item {
    private int bonusDefesa;

    public Armadura(String nome, int preco, int bonusDefesa) {
        super(nome, preco);
        this.bonusDefesa = bonusDefesa;
    }

    public int getBonusDefesa() {
        return bonusDefesa;
    }

    @Override
    public void usar() {
        System.out.printf("Você equipou %s! Defesa aumentada em +%d.%n", getNome(), bonusDefesa);
    }

    @Override
    public String toString() {
        return String.format("[Armadura] %s (+%d Defesa) - %d ouro", getNome(), bonusDefesa, getPreco());
    }
}