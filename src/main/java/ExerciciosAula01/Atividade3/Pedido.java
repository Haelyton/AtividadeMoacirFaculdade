package ExerciciosAula01.Atividade3;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Prato> pratos;

    public Pedido(Cliente cliente, List<Prato> pratos) {
        this.cliente = cliente;
        this.pratos = pratos;
    }

    public void exibirPedido() {
        cliente.exibirNome();
        System.out.println("Pratos do pedido:");
        double total = 0;
        for (Prato prato : pratos) {
            prato.exibirPrato();
            total += prato.getPreco();
        }
        System.out.printf("Total do pedido: R$ %.2f\n", total);
    }
}

