package entities;

public class Pocao extends Item {

    private int cura;

    public Pocao(String nome, int preco, int cura) {
        super(nome, preco);
        this.cura = cura;
    }

    public int getCura() {
        return cura;
    }

    @Override
    public void usar(Personagem personagem) {
        personagem.curar(cura);

        System.out.println(
                personagem.getNome() +
                " recuperou " +
                cura +
                " de vida!"
        );
    }
}
