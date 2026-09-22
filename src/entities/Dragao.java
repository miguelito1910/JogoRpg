package entities;

public class Dragao extends Inimigo {

    public Dragao() {
        super("Dragao", 150, 35, 15, 150, 100);
    }

    @Override
    public String getTipo() {
        return "Dragao";
    }
}
