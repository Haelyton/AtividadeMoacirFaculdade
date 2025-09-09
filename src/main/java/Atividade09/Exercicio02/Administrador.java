package Atividade09.Exercicio02;

public class Administrador implements Autenticavel {

    private String nome;
    private String senha;

    public Administrador(final String nome, final String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(final String senha) {
        return this.senha.equals(senha);
    }
}
