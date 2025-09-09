package Atividade09.Exercicio01;

public class Triangulo implements FormaGeometrica {

    private double altura;
    private double largura;

    public Triangulo(final double altura, final double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
