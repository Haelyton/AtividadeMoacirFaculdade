package Aula06Heranca.Atividade02;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.cor = "Azul";
        r.preenchida = true;
        r.largura = 5.0;
        r.altura = 3.0;

        Circulo c = new Circulo();
        c.cor = "Vermelho";
        c.preenchida = false;
        c.raio = 4.0;

        System.out.println("Retângulo:");
        System.out.println("Cor: " + r.cor + " | Preenchida: " + r.preenchida);
        System.out.println("Área: " + r.calcularArea());

        System.out.println("\nCírculo:");
        System.out.println("Cor: " + c.cor + " | Preenchida: " + c.preenchida);
        System.out.println("Área: " + c.calcularArea());
    }
}
