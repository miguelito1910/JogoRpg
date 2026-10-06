package entities;

public class Pocao extends Item {
    private int quantidadeCura;

    public Pocao(String nome, int preco, int quantidadeCura) {
        super(nome, preco);
        this.quantidadeCura = quantidadeCura;
    }

    public int getQuantidadeCura() {
        return quantidadeCura;
    }

    @Override
    public void usar() {
        System.out.printf("Você usou %s e recuperou %d de vida!%n", getNome(), quantidadeCura);
    }

    @Override
    public String toString() {
        return String.format("[Poção] %s (+%d Vida) - %d ouro", getNome(), quantidadeCura, getPreco());
    }
}