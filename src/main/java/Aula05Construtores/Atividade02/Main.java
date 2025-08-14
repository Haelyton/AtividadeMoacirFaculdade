package Aula05Construtores.Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        Integer idade = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println(pessoa.toString());
    }
}
