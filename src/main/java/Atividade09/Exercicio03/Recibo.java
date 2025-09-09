package Atividade09.Exercicio03;

public class Recibo implements Imprimivel {
    private String cliente;
    private double valor;

    public Recibo(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("===== RECIBO =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor: R$ " + valor);
        System.out.println("==================");
    }
}