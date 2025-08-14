package Aula05Construtores.Atividade01;

public class Produto {

    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(final String nome, final double preco) {
        this.nome = nome;
        this.preco = preco;

        if (preco < 0) {
            this.preco = 0.0;
            System.out.println("Preco invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(final double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
