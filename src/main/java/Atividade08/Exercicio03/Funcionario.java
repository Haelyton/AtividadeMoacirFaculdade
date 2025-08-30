package Atividade08.Exercicio03;

import java.util.ArrayList;
import java.util.List;

abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20; // 20% de bônus
    }
}

class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10; // 10% de bônus
    }
}

