package Atividade09.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nome1", "1234");
        Administrador administrador = new Administrador("Moacir", "1234");

        System.out.println("Retorna False para Usuario: " + usuario.autenticar("123"));
        System.out.println("Retorna True para Usuario: " + usuario.autenticar("1234"));
        System.out.println("--------------------------------");
        System.out.println("Retorna False para Administrador: " + administrador.autenticar("123"));
        System.out.println("Retorna True para Administrador: " + administrador.autenticar("1234"));

    }
}
