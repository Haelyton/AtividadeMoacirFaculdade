package Atividade09.Exercicio02;

import java.util.Objects;

public class Usuario implements Autenticavel{

    private String nome;
    private String senha;

    public Usuario(final String nome, final String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(final String senha) {
        return this.senha.equals(senha);
    }
}
