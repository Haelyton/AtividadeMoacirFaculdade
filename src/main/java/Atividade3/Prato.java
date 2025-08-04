package Atividade3;

public class Prato {
    private String nome;
    private double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirPrato() {
        System.out.printf("Prato: %s - R$ %.2f\n", nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

