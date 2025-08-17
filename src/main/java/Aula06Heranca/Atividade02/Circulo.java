package Aula06Heranca.Atividade02;

class Circulo extends Forma {
    double raio;

    double calcularArea() {
        return Math.PI * raio * raio;
    }
}
