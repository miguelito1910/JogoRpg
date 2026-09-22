package entities;

public class EventoNada extends Evento {

    @Override
    public void executar(
            Personagem personagem,
            Inventario inventario,
            Combate combate) {

        System.out.println();
        System.out.println("Voce nao encontrou nada...");
    }
}
