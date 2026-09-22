package entities;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Item> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);

        System.out.println(
                "Item adicionado ao inventario: " +
                item.getNome()
        );
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void mostrarInventario() {

        System.out.println();
        System.out.println("================================");
        System.out.println("          INVENTARIO");
        System.out.println("================================");

        if (itens.isEmpty()) {
            System.out.println("Inventario vazio.");
        } else {

            for (int i = 0; i < itens.size(); i++) {

                Item item = itens.get(i);

                System.out.println(
                        (i + 1) +
                        " - " +
                        item.getNome()
                );
            }
        }

        System.out.println("================================");
    }

    public void usarItem(int indice, Personagem personagem) {

        if (indice < 0 || indice >= itens.size()) {
            System.out.println("Item invalido.");
            return;
        }

        Item item = itens.get(indice);

        item.usar(personagem);

        if (item instanceof Pocao) {
            itens.remove(item);
        }
    }
}
