package Atividade02.Exercicio03;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class Funcionario {

    private String nome;
    private double salario;
    private Departamento departamento;

    public Funcionario(final String nome, final double salario, final Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
               "nome='" + nome + '\'' +
               ", salario=" + salario +
               ", departamento=" + departamento +
               '}';
    }
}
