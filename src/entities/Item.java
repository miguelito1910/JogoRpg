package entities;

public abstract class Item {
    private String nome;
    private int preco;

    public Item(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public abstract void usar();

    @Override
    public String toString() {
        return String.format("%s (Preço: %d ouro)", nome, preco);
    }
}