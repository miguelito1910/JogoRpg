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
    public void usar(Personagem personagem) {
        System.out.println(
                personagem.getNome() +
                " equipou a armadura " +
                getNome() +
                "!"
        );
    }
}
