package Atividade7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Quarto quarto;
    private Hospede hospede;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(Quarto quarto, Hospede hospede, LocalDate dataEntrada, LocalDate dataSaida) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public void exibirDados() {
        System.out.println("----- Dados da Reserva -----");
        quarto.exibirDados();
        hospede.exibirDados();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de Entrada: " + dataEntrada.format(formato));
        System.out.println("Data de Saída: " + dataSaida.format(formato));
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(final LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(final LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(final Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(final Quarto quarto) {
        this.quarto = quarto;
    }
}
