package Exercicio02;

public class Main {

    public static void escutarMovimento(final Veiculo veiculo) {
        veiculo.mover();
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Carro carro = new Carro();

        escutarMovimento(bicicleta);
        escutarMovimento(carro);
    }
}
