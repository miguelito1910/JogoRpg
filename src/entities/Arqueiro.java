package entities;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
        setVidaMaxima(100);
        setVida(100);
        setAtaque(30);
        setDefesa(15);
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }
}
