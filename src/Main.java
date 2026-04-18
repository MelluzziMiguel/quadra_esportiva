import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Miguel", "449999-9999");

        Horario h1 = new Horario(1, "18:00", 100);
        Horario h2 = new Horario(2, "19:00", 100);

        if (!h1.isOcupado() && !h2.isOcupado()) {
            h1.setOcupado(true);
            h2.setOcupado(true);

            List<Horario> horarios = new ArrayList<>();
            horarios.add(h1);
            horarios.add(h2);

            Aluguel aluguel = new Aluguel(1, cliente1, horarios, "2026-04-17");

            System.out.println("Cliente: " + cliente1.getNome());
            System.out.println("Total: " + aluguel.getValorTotal());
        } else {
            System.out.println("Horário já ocupado!");
        }
    }
}