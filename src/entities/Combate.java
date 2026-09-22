package entities;

import java.util.Random;
import java.util.Scanner;

public class Combate {

    private Scanner scanner;

    public Combate(Scanner scanner) {
        this.scanner = scanner;
    }

    public void iniciar(
            Personagem personagem,
            Inimigo inimigo,
            Inventario inventario) {

        System.out.println();
        System.out.println("================================");
        System.out.println("           COMBATE");
        System.out.println("================================");

        System.out.println(
                "Voce encontrou um " +
                inimigo.getNome() +
                "!"
        );

        while (personagem.estaVivo() && inimigo.estaVivo()) {

            System.out.println();
            System.out.println(
                    personagem.getNome() +
                    " - Vida: " +
                    personagem.getVida() +
                    "/" +
                    personagem.getVidaMaxima()
            );

            System.out.println(
                    inimigo.getNome() +
                    " - Vida: " +
                    inimigo.getVida()
            );

            System.out.println();
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar pocao");
            System.out.println("3 - Fugir");

            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    atacar(personagem, inimigo);
                    break;

                case 2:
                    usarPocao(personagem, inventario);
                    break;

                case 3:
                    System.out.println("Voce fugiu do combate!");
                    return;

                default:
                    System.out.println("Opcao invalida.");
                    continue;
            }

            if (inimigo.estaVivo()) {
                atacarInimigo(personagem, inimigo);
            }
        }

        if (!personagem.estaVivo()) {

            System.out.println();
            System.out.println("Voce foi derrotado!");

            personagem.restaurarVida();

            System.out.println(
                    "Voce voltou para a vila com a vida restaurada."
            );

            return;
        }

        System.out.println();
        System.out.println("================================");
        System.out.println("        INIMIGO DERROTADO!");
        System.out.println("================================");

        personagem.adicionarXp(
                inimigo.getXpRecompensa()
        );

        personagem.adicionarOuro(
                inimigo.getOuroRecompensa()
        );

        System.out.println(
                "Voce recebeu " +
                inimigo.getOuroRecompensa() +
                " de ouro!"
        );
    }

    private void atacar(
            Personagem personagem,
            Inimigo inimigo) {

        System.out.println(
                personagem.getNome() +
                " atacou!"
        );

        inimigo.receberDano(
                personagem.getAtaque()
        );
    }

    private void atacarInimigo(
            Personagem personagem,
            Inimigo inimigo) {

        System.out.println(
                inimigo.getNome() +
                " atacou!"
        );

        personagem.receberDano(
                inimigo.getAtaque()
        );
    }

    private void usarPocao(
            Personagem personagem,
            Inventario inventario) {

        int indicePocao = -1;

        for (int i = 0; i < inventario.getItens().size(); i++) {

            if (inventario.getItens().get(i) instanceof Pocao) {
                indicePocao = i;
                break;
            }
        }

        if (indicePocao == -1) {
            System.out.println("Voce nao possui nenhuma pocao!");
            return;
        }

        inventario.usarItem(
                indicePocao,
                personagem
        );
    }

    public Inimigo criarInimigoAleatorio() {

        Random random = new Random();

        int resultado = random.nextInt(3);

        switch (resultado) {

            case 0:
                return new Goblin();

            case 1:
                return new Orc();

            default:
                return new Dragao();
        }
    }
}
