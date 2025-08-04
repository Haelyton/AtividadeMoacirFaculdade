package Atividade9;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Rex", "Cachorro", 5);
        Animal gato = new Animal("Mimi", "Gato", 3);

        cachorro.fazerBarulho();
        gato.fazerBarulho();
    }
}

