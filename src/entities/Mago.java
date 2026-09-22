package entities;

public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
        setVidaMaxima(80);
        setVida(80);
        setAtaque(35);
        setDefesa(10);
    }

    @Override
    public String getClasse() {
        return "Mago";
    }
}
