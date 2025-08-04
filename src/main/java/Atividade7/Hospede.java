package Atividade7;

public class Hospede {
    private String nome;
    private String documento;

    public Hospede(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public void exibirDados() {
        System.out.println("Hóspede: " + nome);
        System.out.println("Documento: " + documento);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(final String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }
}

