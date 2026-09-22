package entities;

import java.util.Scanner;

public class Loja {

    private Scanner scanner;

    public Loja(Scanner scanner) {
        this.scanner = scanner;
    }

    public void abrir(
            Personagem personagem,
            Inventario inventario) {

        int opcao;

        do {

            System.out.println();
            System.out.println("================================");
            System.out.println("             LOJA");
            System.out.println("================================");

            System.out.println(
                    "Ouro: " +
                    personagem.getOuro()
            );

            System.out.println();
            System.out.println("1 - Pocao de Cura - 30 ouro");
            System.out.println("2 - Espada - 50 ouro");
            System.out.println("3 - Armadura - 60 ouro");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    comprarPocao(personagem, inventario);
                    break;

                case 2:
                    comprarEspada(personagem, inventario);
                    break;

                case 3:
                    comprarArmadura(personagem, inventario);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }

    private void comprarPocao(
            Personagem personagem,
            Inventario inventario) {

        if (personagem.gastarOuro(30)) {

            inventario.adicionarItem(
                    new Pocao(
                            "Pocao de Cura",
                            30,
                            40
                    )
            );

            System.out.println("Pocao comprada!");

        } else {

            System.out.println("Ouro insuficiente!");
        }
    }

    private void comprarEspada(
            Personagem personagem,
            Inventario inventario) {

        if (personagem.gastarOuro(50)) {

            inventario.adicionarItem(
                    new Arma(
                            "Espada",
                            50,
                            5
                    )
            );

            System.out.println("Espada comprada!");

        } else {

            System.out.println("Ouro insuficiente!");
        }
    }

    private void comprarArmadura(
            Personagem personagem,
            Inventario inventario) {

        if (personagem.gastarOuro(60)) {

            inventario.adicionarItem(
                    new Armadura(
                            "Armadura",
                            60,
                            5
                    )
            );

            System.out.println("Armadura comprada!");

        } else {

            System.out.println("Ouro insuficiente!");
        }
    }
}
