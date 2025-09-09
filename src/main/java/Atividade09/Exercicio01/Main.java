package Atividade09.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(6, 4);

        System.out.println("Circulo: " + circulo.calcularArea());
        System.out.println("Triangulo: " + triangulo.calcularArea());

    }
}
