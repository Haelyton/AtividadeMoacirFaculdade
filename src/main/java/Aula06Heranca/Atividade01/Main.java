package Aula06Heranca.Atividade01;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();

        g.nome = "Carlos Silva";
        g.salario = 7500.00;
        g.setor = "Financeiro";

        System.out.println("Nome: " + g.nome);
        System.out.println("Salário: R$ " + g.salario);
        System.out.println("Setor: " + g.setor);
    }
}
