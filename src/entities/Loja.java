package entities;

import java.util.Scanner;

public class Loja {

    private static final int PRECO_POCAO = 30;
    private static final int PRECO_ESPADA = 50;
    private static final int PRECO_ARMADURA = 60;

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
            System.out.println("1 - Pocao de Cura - " + PRECO_POCAO + " ouro");
            System.out.println("2 - Espada - " + PRECO_ESPADA + " ouro");
            System.out.println("3 - Armadura - " + PRECO_ARMADURA + " ouro");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                comprarItem(personagem, inventario,
                        new Pocao("Pocao de Cura", PRECO_POCAO, 40));
                    break;

                case 2:
                comprarItem(personagem, inventario,
                        new Arma("Espada", PRECO_ESPADA, 5));
                    break;

                case 3:
                comprarItem(personagem, inventario,
                        new Armadura("Armadura", PRECO_ARMADURA, 5));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }

    private void comprarItem(
            Personagem personagem,
            Inventario inventario,
            Item item) {

        if (personagem.gastarOuro(item.getPreco())) {
            inventario.adicionarItem(item);
            System.out.println(item.getNome() + " comprado!");
        } else {
            System.out.println("Ouro insuficiente!");
        }
    }
}
