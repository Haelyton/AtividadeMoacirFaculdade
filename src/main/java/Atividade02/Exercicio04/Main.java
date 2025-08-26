package Atividade02.Exercicio04;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Notebook", 1, 3500.0);
        pedido.adicionarItem("Mouse", 2, 80.0);
        pedido.adicionarItem("Teclado", 1, 200.0);

        System.out.println("Itens do pedido:");
        pedido.mostrarItens();

        pedido.removerItem("Mouse");

        System.out.println("\nApós remover Mouse:");
        pedido.mostrarItens();

        System.out.println("\nValor total do pedido: R$" + pedido.valorTotal());
    }
}

