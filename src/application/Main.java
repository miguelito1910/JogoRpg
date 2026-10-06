package application;

import entities.Exploracao;
import entities.Inventario;

public class Main {
    public static void main(String[] args) {

        // Instancia o inventario vazio do jogador
        Inventario inventario = new Inventario();

        // Passa o inventario para a exploracao poder adicionar os itens encontrados
        Exploracao menu = new Exploracao(inventario);

        // Inicia o menu de exploracao
        menu.menuExploracao();
    }
}