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
    public void usar(Personagem personagem) {
        System.out.println(
                personagem.getNome() +
                " equipou a arma " +
                getNome() +
                "!"
        );
    }
}
