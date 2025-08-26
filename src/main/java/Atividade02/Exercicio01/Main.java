package Atividade02.Exercicio01;

import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
            new Aluno("João Silva", "2023001", "Engenharia"),
            new Aluno("Maria Oliveira", "2023002", "Medicina"),
            new Aluno("Pedro Santos", "2023003", "Direito")
        );

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
