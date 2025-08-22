package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Produto1", 50.00, 100));
        produtos.add(new Produto("Produto2", 90.00, 30));
        produtos.add(new Produto("Produto3", 1500.00, 200));

        System.out.println(produtos.toString());
    }
}
