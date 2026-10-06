package entities;

import service.SorteiaEvento;
import java.util.Scanner;

public class Exploracao {
    private Scanner sc = new Scanner(System.in);
    private SorteiaEvento sorteio = new SorteiaEvento();
    private Inventario inventario; // Conexão com seu módulo

    // Construtor recebendo o inventário do jogador
    public Exploracao(Inventario inventario) {
        this.inventario = inventario;
    }

    public void menuExploracao() {
        int opcao = 0;
        do {
            System.out.println("""
                    Escolha a sua jornada:
                    1 - Floresta
                    2 - Caverna
                    3 - Masmorra
                    4 - Castelo
                    5 - Retornar ao menu principal
                    0 - Sair
                    """);
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> floresta();
                case 2 -> caverna();
                case 3 -> masmorra();
                case 4 -> castelo();
            }
        } while (opcao != 0);
    }

    private void caverna() {
        try {
            System.out.println("Você entrou em uma caverna muito escura, quando de repente...\n");
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);

            switch (resultado) {
                case 0 -> {
                    System.out.println("Você entrou em combate contra uma criatura assustadora!");
                    Thread.sleep(2000);
                    combate("Caverna");
                }
                case 1 -> {
                    System.out.println("Você encontrou um baú!");
                    Thread.sleep(2000);
                    dinheiroBau();
                }
                case 2 -> {
                    System.out.println("Você encontrou um item!");
                    Pocao pocaoEncontrada = new Pocao("Poção Misteriosa", 20, 30);
                    inventario.adicionarItem(pocaoEncontrada); // Adiciona ao seu inventário
                    Thread.sleep(2000);
                }
                case 3 -> {
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                }
            }
            System.out.println("Aperte ENTER para continuar...");
            sc.nextLine();
        } catch (InterruptedException e) {
            System.out.println("Erro na pausa do sistema.");
        }
    }

    private void floresta() {
        try {
            System.out.println("Você entrou em uma floresta gigantesca, quando de repente...\n");
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);

            switch (resultado) {
                case 0 -> {
                    System.out.println("Você entrou em combate contra uma criatura assustadora!");
                    Thread.sleep(2000);
                    combate("Floresta");
                }
                case 1 -> {
                    System.out.println("Você encontrou um baú!");
                    Thread.sleep(2000);
                    dinheiroBau();
                }
                case 2 -> {
                    System.out.println("Você encontrou um item!");
                    Arma espadaAchada = new Arma("Adaga de Madeira", 15, 5);
                    inventario.adicionarItem(espadaAchada);
                    Thread.sleep(2000);
                }
                case 3 -> {
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                }
            }
            System.out.println("Aperte ENTER para continuar...");
            sc.nextLine();
        } catch (InterruptedException e) {
            System.out.println("Erro na pausa do sistema.");
        }
    }

    private void masmorra() {
        try {
            System.out.println("Você entrou em uma masmorra tenebrosa, quando de repente...\n");
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);

            switch (resultado) {
                case 0 -> {
                    System.out.println("Você entrou em combate contra uma criatura assustadora!");
                    Thread.sleep(2000);
                    combate("Masmorra");
                }
                case 1 -> {
                    System.out.println("Você encontrou um baú!");
                    Thread.sleep(2000);
                    dinheiroBau();
                }
                case 2 -> {
                    System.out.println("Você encontrou um item!");
                    Pocao pocaoVida = new Pocao("Poção de Vida", 30, 50);
                    inventario.adicionarItem(pocaoVida);
                    Thread.sleep(2000);
                }
                case 3 -> {
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                }
            }
            System.out.println("Aperte ENTER para continuar...");
            sc.nextLine();
        } catch (InterruptedException e) {
            System.out.println("Erro na pausa do sistema.");
        }
    }

    private void castelo() {
        try {
            System.out.println("Você finalmente entrou no castelo, quando de repente...\n");
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);

            switch (resultado) {
                case 0 -> {
                    System.out.println("Você entrou em combate contra uma criatura assustadora!");
                    Thread.sleep(2000);
                    combate("Castelo");
                }
                case 1 -> {
                    System.out.println("Você encontrou um baú!");
                    Thread.sleep(2000);
                    dinheiroBau();
                }
                case 2 -> {
                    System.out.println("Você encontrou um item!");
                    Armadura armaduraReluzente = new Armadura("Escudo Real", 80, 15);
                    inventario.adicionarItem(armaduraReluzente);
                    Thread.sleep(2000);
                }
                case 3 -> {
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                }
            }
            System.out.println("Aperte ENTER para continuar...");
            sc.nextLine();
        } catch (InterruptedException e) {
            System.out.println("Erro na pausa do sistema.");
        }
    }

    private void dinheiroBau() {
        int resultado = sorteio.sorteioEvento(3);
        switch (resultado) {
            case 0 -> System.out.println("Você ganhou 100 moedas de ouro!!!");
            case 1 -> System.out.println("Você ganhou 120 moedas de ouro!!!");
            case 2 -> System.out.println("Você ganhou 150 moedas de ouro!!!");
        }
    }

    public void combate(String cenario) {
        int resultado = sorteio.sorteioEvento(3);

        if (cenario.equalsIgnoreCase("Floresta")) {
            switch (resultado) {
                case 0 -> System.out.println("Você encontrou um urso faminto!!!");
                case 1 -> System.out.println("Você encontrou um goblin maluco!!!");
                case 2 -> System.out.println("Você encontrou um javali furioso!");
            }
        } else if (cenario.equalsIgnoreCase("Caverna")) {
            switch (resultado) {
                case 0 -> System.out.println("Você encontrou um morcego!!!");
                case 1 -> System.out.println("Você encontrou uma aranha peludaça!!!");
                case 2 -> System.out.println("Você encontrou um troll com uma faquinha de serra!");
            }
        } else if (cenario.equalsIgnoreCase("Masmorra")) {
            switch (resultado) {
                case 0 -> System.out.println("Você encontrou um esqueleto dançarino!!!");
                case 1 -> System.out.println("Você encontrou um rato gigante!!!");
                case 2 -> System.out.println("Você encontrou uma múmia muito louca!!!");
            }
        } else if (cenario.equalsIgnoreCase("Castelo")) {
            switch (resultado) {
                case 0 -> System.out.println("Você encontrou um guarda!!!");
                case 1 -> System.out.println("Você encontrou um mago!!!");
                case 2 -> System.out.println("Você encontrou o fantasma do rei!!!");
            }
        }
    }
}