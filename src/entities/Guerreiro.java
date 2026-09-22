package entities;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);

        setVidaMaxima(120);
        setVida(120);
        setAtaque(25);
        setDefesa(20);
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }
}