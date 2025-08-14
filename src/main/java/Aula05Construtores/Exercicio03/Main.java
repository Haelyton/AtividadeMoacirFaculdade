package Aula05Construtores.Exercicio03;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Daniela");
        nomes.add("Eduardo");

        Random random = new Random();

        int indiceSorteado = random.nextInt(nomes.size());

        System.out.println("Nome sorteado: " + nomes.get(indiceSorteado));
    }
}
