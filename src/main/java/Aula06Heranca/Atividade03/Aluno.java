package Aula06Heranca.Atividade03;

class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
}