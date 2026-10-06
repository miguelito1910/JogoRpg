package entities;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> itens;

    public Inventario() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        if (item != null) {
            itens.add(item);
            System.out.println(item.getNome() + " foi adicionado ao seu inventário.");
        }
    }

    public void removerItem(Item item) throws InventarioException {
        if (!itens.remove(item)) {
            throw new InventarioException("O item não foi encontrado no inventário para remoção.");
        }
        System.out.println(item.getNome() + " foi removido do inventário.");
    }

    public Item buscarItemPorNome(String nome) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    public Pocao buscarEUsarPocao() throws InventarioException {
        for (Item item : itens) {
            if (item instanceof Pocao) {
                Pocao pocao = (Pocao) item;
                itens.remove(pocao);
                return pocao;
            }
        }
        throw new InventarioException("Você não possui nenhuma poção no inventário!");
    }

    public void listarItens() {
        System.out.println("\n========== SEU INVENTÁRIO ==========");
        if (itens.isEmpty()) {
            System.out.println("Seu inventário está vazio.");
        } else {
            for (int i = 0; i < itens.size(); i++) {
                System.out.printf("%d - %s%n", (i + 1), itens.get(i));
            }
        }
        System.out.println("=====================================");
    }

    public ArrayList<Item> getItens() {
        return itens;
    }
}