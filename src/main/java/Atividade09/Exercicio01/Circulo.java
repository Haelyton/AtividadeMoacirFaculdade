package Atividade09.Exercicio01;

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo(final double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
