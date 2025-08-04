package Atividade2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", "2025001", 5);
        aluno.adicionarNota(7.5f);
        aluno.adicionarNota(8.0f);
        aluno.adicionarNota(6.0f);
        aluno.exibirBoletim();
    }
}
