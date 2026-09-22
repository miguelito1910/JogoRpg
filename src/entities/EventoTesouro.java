package entities;

import java.util.Random;

public class EventoTesouro extends Evento {

    @Override
    public void executar(
            Personagem personagem,
            Inventario inventario,
            Combate combate) {

        Random random = new Random();

        int ouro = random.nextInt(51) + 25;

        personagem.adicionarOuro(ouro);

        System.out.println();
        System.out.println("Voce encontrou um tesouro!");
        System.out.println(
                "Voce ganhou " +
                ouro +
                " de ouro!"
        );
    }
}
