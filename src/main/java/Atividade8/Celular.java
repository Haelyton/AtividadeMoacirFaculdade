package Atividade8;

public class Celular {
    private String marca;
    private String modelo;
    private String numeroDeSerie;

    public Celular(String marca, String modelo, String numeroDeSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de Série: " + numeroDeSerie);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(final String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
}
