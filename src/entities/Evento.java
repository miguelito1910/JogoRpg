package entities;

public abstract class Evento {

    public abstract void executar(
            Personagem personagem,
            Inventario inventario,
            Combate combate
    );
}
