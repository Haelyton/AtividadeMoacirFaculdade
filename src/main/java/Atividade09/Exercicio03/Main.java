package Atividade09.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Imprimivel rel = new Relatorio("Vendas de Março", "Total de vendas: R$ 50.000");
        Imprimivel rec = new Recibo("Maria Silva", 120.75);

        rel.imprimir();
        rec.imprimir();
    }
}
