package entities;

import java.util.Random;

public class EventoItem extends Evento {

    @Override
    public void executar(
            Personagem personagem,
            Inventario inventario,
            Combate combate) {

        Random random = new Random();

        int resultado = random.nextInt(3);

        switch (resultado) {

            case 0:
                inventario.adicionarItem(
                        new Pocao(
                                "Pocao de Cura",
                                30,
                                40
                        )
                );
                break;

            case 1:
                inventario.adicionarItem(
                        new Arma(
                                "Espada Encontrada",
                                50,
                                5
                        )
                );
                break;

            default:
                inventario.adicionarItem(
                        new Armadura(
                                "Armadura Encontrada",
                                60,
                                5
                        )
                );
                break;
        }
    }
}
