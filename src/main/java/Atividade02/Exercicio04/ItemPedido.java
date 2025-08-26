package Atividade02.Exercicio04;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class ItemPedido {

    private String produto;
    private Integer quantidade;
    private double preco;

    public ItemPedido(final String produto, final Integer quantidade, final double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getSubtotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto + " (R$" + preco + ")";
    }
}
