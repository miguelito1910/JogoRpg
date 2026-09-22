package application;

import entities.Arqueiro;
import entities.Arma;
import entities.Armadura;
import entities.Guerreiro;
import entities.Inventario;
import entities.Loja;
import entities.Mago;
import entities.Pocao;
import entities.Personagem;
import entities.Exploracao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       CRIACAO DE PERSONAGEM");
        System.out.println("================================");

        System.out.print("Digite o nome do personagem: ");

        String nome = scanner.nextLine();

        System.out.println();
        System.out.println("Escolha sua classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");

        System.out.print("Digite uma opcao: ");

        int opcaoClasse = scanner.nextInt();

        Personagem personagem;

        switch (opcaoClasse) {

            case 1:
                personagem = new Guerreiro(nome);
                break;

            case 2:
                personagem = new Mago(nome);
                break;

            case 3:
                personagem = new Arqueiro(nome);
                break;

            default:
                System.out.println("Opcao invalida.");
                scanner.close();
                return;
        }

        Inventario inventario = new Inventario();

        adicionarItensIniciais(
                personagem,
                inventario
        );

        Exploracao exploracao =
                new Exploracao(scanner);

        Loja loja =
                new Loja(scanner);

        int opcao;

        do {

            System.out.println();
            System.out.println("================================");
            System.out.println("          MENU PRINCIPAL");
            System.out.println("================================");

            System.out.println("1 - Explorar");
            System.out.println("2 - Ver personagem");
            System.out.println("3 - Inventario");
            System.out.println("4 - Loja");
            System.out.println("5 - Sair");

            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    exploracao.iniciar(
                            personagem,
                            inventario
                    );
                    break;

                case 2:
                    personagem.mostrarPersonagem();
                    break;

                case 3:
                    inventario.mostrarInventario();
                    break;

                case 4:
                    loja.abrir(
                            personagem,
                            inventario
                    );
                    break;

                case 5:
                    System.out.println(
                            "Obrigado por jogar!"
                    );
                    break;

                default:
                    System.out.println(
                            "Opcao invalida."
                    );
            }

        } while (opcao != 5);

        scanner.close();
    }

    private static void adicionarItensIniciais(
            Personagem personagem,
            Inventario inventario) {

        if (personagem instanceof Guerreiro) {

            inventario.adicionarItem(
                    new Arma(
                            "Espada Inicial",
                            0,
                            5
                    )
            );

            inventario.adicionarItem(
                    new Armadura(
                            "Armadura Inicial",
                            0,
                            5
                    )
            );

        } else if (personagem instanceof Mago) {

            inventario.adicionarItem(
                    new Pocao(
                            "Pocao Inicial",
                            0,
                            40
                    )
            );

        } else if (personagem instanceof Arqueiro) {

            inventario.adicionarItem(
                    new Arma(
                            "Arco Inicial",
                            0,
                            5
                    )
            );

            inventario.adicionarItem(
                    new Pocao(
                            "Pocao Inicial",
                            0,
                            40
                    )
            );
        }
    }
}