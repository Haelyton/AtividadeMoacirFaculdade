package Atividade08.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos", 8000));
        funcionarios.add(new Vendedor("Ana", 4000));
        funcionarios.add(new Vendedor("João", 3500));
        funcionarios.add(new Gerente("Mariana", 9000));

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome +
                    " | Salário: " + f.salario +
                    " | Bônus: " + f.calcularBonus());
        }
    }
}
