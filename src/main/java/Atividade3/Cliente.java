package Atividade3;

/*
* Implemente as classes:
    Cliente (atributo: nome; método: exibirNome())
    Prato (atributos: nome, preco; método: exibirPrato())
    Pedido (atributos: cliente e lista de pratos; método: exibirPedido())

* */

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Cliente: " + nome);
    }

    public String getNome() {
        return nome;
    }
}

