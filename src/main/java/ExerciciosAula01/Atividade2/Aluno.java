package ExerciciosAula01.Atividade2;

/*
* Crie a classe Aluno com os atributos nome,
* matrícula e um vetor de notas. Implemente os
* métodos adicionarNota(float nota), calcularMedia()
* e exibirBoletim().
* */

public class Aluno {
    private String nome;
    private String matricula;
    private float[] notas;
    private int quantidadeNotas;

    public Aluno(String nome, String matricula, int maxNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new float[maxNotas];
        this.quantidadeNotas = 0;
    }

    public void adicionarNota(float nota) {
        if (quantidadeNotas < notas.length) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        } else {
            System.out.println("Não é possível adicionar mais notas.");
        }
    }

    public float calcularMedia() {
        if (quantidadeNotas == 0) return 0;

        float soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        return soma / quantidadeNotas;
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.print("Notas: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        System.out.printf("Média: %.2f\n", calcularMedia());
    }
}
