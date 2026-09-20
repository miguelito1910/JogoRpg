package entities;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exploracao {

    Scanner sc = new Scanner(System.in);


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
        System.out.println("""
                Você entrou em uma caverna muito escura, quando de repente... 
                """);

        int resultado = sorteioEvento(4);

        switch (resultado) {
            case 0:
                System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                combate("Caverna");
                break;
            case 1:
                System.out.println("Você encontrou um baú! ");
                dinheiroBau();
                break;
            case 2:
                System.out.println("Você encontrou um item!");
                //ganhou um item ai
                break;
            case 3:
                System.out.println("Nada aconteceu...");
                break;

        }
    }

    private void floresta() {
        System.out.println("""
                Você entrou em uma floresta gigantesca, quando de repente... 
                """);
        int resultado = sorteioEvento(4);

        switch (resultado) {
            case 0:
                System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                combate("Floresta");
                break;
            case 1:
                System.out.println("Você encontrou um baú! ");
                dinheiroBau();
                break;
            case 2:
                System.out.println("Você encontrou um item!");
                //ganhou um item ai
                break;
            case 3:
                System.out.println("Nada aconteceu...");
                break;

        }
    }

    private void masmorra() {

        System.out.println("""
                Você entrou em uma masmorra tenebrosa, quando de repente... 
                """);
        int resultado = sorteioEvento(4);


        switch (resultado) {
            case 0:
                System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                combate("Masmorra");
                break;
            case 1:
                System.out.println("Você encontrou um baú! ");
                dinheiroBau();
                break;
            case 2:
                System.out.println("Você encontrou um item!");
                //ganhou um item ai
                break;
            case 3:
                System.out.println("Nada aconteceu...");
                break;

        }
    }

    private void castelo() {
        System.out.println("""
                Você finalmente entrou no castelo, quando de repente... 
                """);
        int resultado = sorteioEvento(4);

        switch (resultado) {
            case 0:
                System.out.println("Você entrou em combate contra uma criatura assustadora! ");
                combate("Castelo");
                break;
            case 1:
                System.out.println("Você encontrou um baú! ");
                dinheiroBau();
                break;
            case 2:
                System.out.println("Você encontrou um item!");
                //ganhou um item ai
                break;
            case 3:
                System.out.println("Nada aconteceu...");
                break;

        }
    }


    private int sorteioEvento(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    private void dinheiroBau() {
        int resultado = sorteioEvento(3);

        switch (resultado) {
            case 0:
                //dinheiro += 100;
                System.out.println("você ganhou 100 reais!!!");
                break;
            case 1:
                //dinheiro += 120;
                System.out.println("você ganhou 120 reais!!!");
                break;
            case 2:
                //dinheiro += 150
                System.out.println("você ganhou 150 reais!!!");
        }
    }


    public void combate(String cenario) {

        int resultado = sorteioEvento(3);

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