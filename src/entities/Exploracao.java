package entities;

import service.SorteiaEvento;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exploracao {
    Scanner sc = new Scanner(System.in);
    SorteiaEvento sorteio = new SorteiaEvento();
    private Inventario inventario;

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
                    """
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    floresta();
                    break;
                case 2:
                    caverna();
                    break;
                case 3:
                    masmorra();
                    break;
                case 4:
                    castelo();
                    break;
                case 5:
                    //voltar();
                    break;
            }
        } while (opcao != 0);
    }

    private void caverna() {
        try {
            System.out.println("""
                    Você entrou em uma caverna muito escura, quando de repente... 
                    """);
            Thread.sleep(2000);
            int resultado = 2;
            //sorteioEvento(4);

            switch (resultado) {
                case 0:
                    System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                    Thread.sleep(2000);
                    combate("Caverna");
                    break;
                case 1:
                    System.out.println("Você encontrou um baú! ");
                    Thread.sleep(2000);
                    dinheiroBau();
                    break;
                case 2:
                    System.out.println("Você encontrou um item!");
                    Pocao pocaoCaverna = new Pocao("Poção de Vida", 30, 40);
                    inventario.adicionarItem(pocaoCaverna);
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
            }
        } catch (InterruptedException e) {
            System.out.println("Deu erro nas pausas");
        }

    }

    private void floresta() {
        try {
            System.out.println("""
                    Você entrou em uma floresta gigantesca, quando de repente... 
                    """);
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);

            switch (resultado) {
                case 0:
                    System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                    Thread.sleep(2000);
                    combate("Floresta");
                    break;
                case 1:
                    System.out.println("Você encontrou um baú! ");
                    Thread.sleep(2000);
                    dinheiroBau();
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Você encontrou um item!");
                    Arma espadaFloresta = new Arma("Adaga de Madeira", 20, 5);
                    inventario.adicionarItem(espadaFloresta);
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
            }
        } catch (InterruptedException e){
            System.out.println("Deu erro ai");

        }
    }


    private void masmorra() {
        try{
            System.out.println("""
                Você entrou em uma masmorra tenebrosa, quando de repente... 
                """);
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);


            switch (resultado) {
                case 0:
                    System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                    Thread.sleep(2000);
                    combate("Masmorra");
                    break;
                case 1:
                    System.out.println("Você encontrou um baú! ");
                    Thread.sleep(2000);
                    dinheiroBau();
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Você encontrou um item!");
                    Pocao pocaoMasmorra = new Pocao("Poção Grande de Vida", 50, 70);
                    inventario.adicionarItem(pocaoMasmorra);
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
            }
        } catch(InterruptedException e){
            System.out.println("erro ai");
        }
    }

    private void castelo() {
        try{
            System.out.println("""
                Você finalmente entrou no castelo, quando de repente... 
                """);
            Thread.sleep(2000);
            int resultado = sorteio.sorteioEvento(4);

            switch (resultado) {
                case 0:
                    System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                    Thread.sleep(2000);
                    combate("Castelo");
                    break;
                case 1:
                    System.out.println("Você encontrou um baú! ");
                    Thread.sleep(2000);
                    dinheiroBau();
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Você encontrou um item!");
                    Armadura armaduraCastelo = new Armadura("Escudo de Aço", 100, 15);
                    inventario.adicionarItem(armaduraCastelo);
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Nada aconteceu...");
                    Thread.sleep(2000);
                    System.out.println("Aperte enter para continuar: ");
                    sc.nextLine();
                    break;
            }
        } catch (InterruptedException e){
            System.out.println("Deu erro");
        }
    }




    private void dinheiroBau() {
        int resultado = sorteio.sorteioEvento(4);

        switch (resultado) {
            case 0:
                //dinheiro += 100;
                System.out.println("você ganhou 100 reais!!!");
                break;
            case 1:
                //dinheiro += 120;
                System.out.print("você ganhou 120 reais!!!");
                break;
            case 2:
                //dinheiro += 150
                System.out.println("você ganhou 150 reais!!!");
        }
    }


    public void combate(String cenario) {

        int resultado = sorteio.sorteioEvento(4);

        if (cenario.equalsIgnoreCase("Floresta")) {
            switch (resultado) {
                case 0:
                    System.out.println("Você encontrou um urso faminto!!!");
                    break;
                case 1:
                    System.out.println("Você encontrou um goblin maluco!!!");
                    break;
                case 2:
                    System.out.println("Você encontrou um javali furioso");
                    break;

            }


        } else if (cenario.equalsIgnoreCase("Caverna")) {
            switch (resultado) {
                case 0:
                    System.out.println("Você encontrou um morcego!!!");
                    break;
                case 1:
                    System.out.println("Você encontrou uma aranha peludaça!!!");
                    break;
                case 2:
                    System.out.println("Você encontrou um troll com uma faquinha de serra");
                    break;

            }
        }

        else if (cenario.equalsIgnoreCase("Masmorra")) {
            switch (resultado) {
                case 0:
                    System.out.println("Você encontrou um esqueleto dançarino!!!");
                    break;
                case 1:
                    System.out.println("Você encontrou um rato gigante!!!");
                    break;
                case 2:
                    System.out.println("Você encontrou uma múmia muito louca!!!");
                    break;

            }
        }

        else if (cenario.equalsIgnoreCase("Castelo")) {
            switch (resultado) {
                case 0:
                    System.out.println("Você encontrou um guarda!!!");
                    break;
                case 1:
                    System.out.println("Você encontrou um mago!!!");
                    break;
                case 2:
                    System.out.println("Você encontrou o fantasma do rei!!!");
                    break;

            }
        }

    }
}