package Atividade4;

public class Main {
    public static void main(String[] args) {
        Departamento dep = new Departamento("Tecnologia");

        Funcionario f1 = new Funcionario("Ana", dep);
        Funcionario f2 = new Funcionario("Bruno", dep);
        Funcionario f3 = new Funcionario("Carlos", dep);

        dep.adicionarFuncionario(f1);
        dep.adicionarFuncionario(f2);
        dep.adicionarFuncionario(f3);

        System.out.println("Departamento: " + dep.getNome());
        System.out.println("Funcionários:");
        for (Funcionario f : dep.getFuncionarios()) {
            System.out.println("- " + f.getNome());
        }
    }
}

