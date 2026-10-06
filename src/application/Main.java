package application;

import entities.Exploracao;
import entities.Inventario;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Exploracao menu = new Exploracao(inventario);

        menu.menuExploracao();
    }
}