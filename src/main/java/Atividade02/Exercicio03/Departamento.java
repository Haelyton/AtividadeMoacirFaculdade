package Atividade02.Exercicio03;

import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class Departamento {

    private String nome;
    private static List<Funcionario> funcionarios;

    public Departamento(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public static void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
