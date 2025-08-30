package Atividade08.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Honda", "CB 500");

        carro.exibirDados();
        carro.acelerar();

        moto.exibirDados();
        moto.acelerar();
    }
}
