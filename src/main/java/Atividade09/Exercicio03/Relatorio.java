package Atividade09.Exercicio03;

public class Relatorio implements Imprimivel {
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("===== RELATÓRIO =====");
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("=====================");
    }
}
