package Atividade02.Exercicio03;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class Main {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento("TI");
        Departamento departamento2 = new Departamento("RH");

        Funcionario funcionario1 = new Funcionario("João", 3000.0, departamento1);
        Funcionario funcionario2 = new Funcionario("Maria", 3500.0, departamento1);
        Funcionario funcionario3 = new Funcionario("Ana", 4000.0, departamento2);

        Departamento.addFuncionario(funcionario1);
        Departamento.addFuncionario(funcionario2);
        Departamento.addFuncionario(funcionario3);

        System.out.println(Departamento.getFuncionarios());
    }
}
