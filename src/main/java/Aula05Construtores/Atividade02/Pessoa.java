package Aula05Construtores.Atividade02;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(final String nome, final Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(final Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Seu nome=" + nome +
                ", sua idade='" + idade + '\'' +
                '}';
    }
}
