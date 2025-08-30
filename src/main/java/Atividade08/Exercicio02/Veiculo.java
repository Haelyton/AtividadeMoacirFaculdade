package Atividade08.Exercicio02;

abstract class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();

    public void exibirDados() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }

}
