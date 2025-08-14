package ExerciciosAula01.Atividade3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");
        Prato prato1 = new Prato("Lasanha", 25.50);
        Prato prato2 = new Prato("Salada Caesar", 15.00);
        Prato prato3 = new Prato("Refrigerante", 7.00);

        Pedido pedido = new Pedido(cliente, Arrays.asList(prato1, prato2, prato3));
        pedido.exibirPedido();
    }
}
