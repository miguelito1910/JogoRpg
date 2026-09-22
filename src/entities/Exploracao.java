package entities;

import java.util.Random;
import java.util.Scanner;

public class Exploracao {

    private Scanner scanner;
    private Combate combate;

    public Exploracao(Scanner scanner) {
        this.scanner = scanner;
        this.combate = new Combate(scanner);
    }

    public void iniciar(
            Personagem personagem,
            Inventario inventario) {

        int opcao;

        do {

            System.out.println();
            System.out.println("================================");
            System.out.println("           EXPLORACAO");
            System.out.println("================================");

            System.out.println("1 - Floresta");
            System.out.println("2 - Caverna");
            System.out.println("3 - Montanha");
            System.out.println("4 - Castelo");
            System.out.println("0 - Voltar");

            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    explorarCenario(
                            Cenario.FLORESTA,
                            personagem,
                            inventario
                    );
                    break;

                case 2:
                    explorarCenario(
                            Cenario.CAVERNA,
                            personagem,
                            inventario
                    );
                    break;

                case 3:
                    explorarCenario(
                            Cenario.MONTANHA,
                            personagem,
                            inventario
                    );
                    break;

                case 4:
                    explorarCenario(
                            Cenario.CASTELO,
                            personagem,
                            inventario
                    );
                    break;

                case 0:
                    System.out.println(
                            "Voltando para a vila..."
                    );
                    break;

                default:
                    System.out.println(
                            "Opcao invalida."
                    );
            }

        } while (opcao != 0);
    }

    private void explorarCenario(
            Cenario cenario,
            Personagem personagem,
            Inventario inventario) {

        System.out.println();
        System.out.println(
                "Voce entrou em: " +
                cenario
        );

        Evento evento = sortearEvento();

        evento.executar(
                personagem,
                inventario,
                combate
        );
    }

    private Evento sortearEvento() {

        Random random = new Random();

        int resultado = random.nextInt(4);

        switch (resultado) {

            case 0:
                return new EventoCombate();

            case 1:
                return new EventoTesouro();

            case 2:
                return new EventoItem();

            default:
                return new EventoNada();
        }
    }
}
