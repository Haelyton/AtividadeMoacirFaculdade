package ExerciciosAula01.Atividade9;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void fazerBarulho() {
        System.out.println(nome + " faz um barulho!");
    }

    // Getters e setters (opcional)
}

