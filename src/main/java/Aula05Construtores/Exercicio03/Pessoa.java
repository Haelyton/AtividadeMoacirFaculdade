package Aula05Construtores.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private List<String> nome = new ArrayList<>();
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(final List<String> nome, final Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
