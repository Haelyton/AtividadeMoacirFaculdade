package ExerciciosAula01.Atividade7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Quarto quarto = new Quarto(101, "Suíte", "Disponível");
        Hospede hospede = new Hospede("Carlos Silva", "12345678900");
        Reserva reserva = new Reserva(quarto, hospede, LocalDate.of(2025, 8, 10), LocalDate.of(2025, 8, 15));

        reserva.exibirDados();
    }
}
