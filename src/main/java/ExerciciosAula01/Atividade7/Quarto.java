package ExerciciosAula01.Atividade7;

public class Quarto {
    private int numero;
    private String tipo;
    private String status;

    public Quarto(int numero, String tipo, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
    }

    public void exibirDados() {
        System.out.println("Quarto número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(final int numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }
}

