package entities;

public class EventoCombate extends Evento {

    @Override
    public void executar(
            Personagem personagem,
            Inventario inventario,
            Combate combate) {

        System.out.println();
        System.out.println("Voce encontrou um inimigo!");

        Inimigo inimigo =
                combate.criarInimigoAleatorio();

        combate.iniciar(
                personagem,
                inimigo,
                inventario
        );
    }
}
