package Atividade02.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(String produto, int qtd, double preco) {
        itens.add(new ItemPedido(produto, qtd, preco));
    }

    public void removerItem(String produto) {
        itens.removeIf(item -> item.getProduto().equalsIgnoreCase(produto));
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void mostrarItens() {
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
    }

}
