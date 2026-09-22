package entities;

public class Orc extends Inimigo {

    public Orc() {
        super("Orc", 80, 20, 10, 60, 40);
    }

    @Override
    public String getTipo() {
        return "Orc";
    }
}
