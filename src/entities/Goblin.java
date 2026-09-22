package entities;

public class Goblin extends Inimigo {

    public Goblin() {
        super("Goblin", 50, 15, 5, 40, 25);
    }

    @Override
    public String getTipo() {
        return "Goblin";
    }
}
