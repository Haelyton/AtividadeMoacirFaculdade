package Atividade02.Exercicio03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class Departamento {

    private String nome;
    private static List<Funcionario> funcionarios = new ArrayList<>();

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

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
