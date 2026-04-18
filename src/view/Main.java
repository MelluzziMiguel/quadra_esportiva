package view;

import controller.AluguelController;
import model.Aluguel;
import model.Cliente;
import model.Horario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AluguelController controller = new AluguelController();

        Cliente cliente1 = new Cliente(1, "Miguel", "449999-9999");

        Horario h1 = new Horario(1, "18:00", 100);
        Horario h2 = new Horario(2, "19:00", 100);

        List<Horario> horarios = new ArrayList<>();
        horarios.add(h1);
        horarios.add(h2);

        try {
            Aluguel aluguel = controller.criarAluguel(1, cliente1, horarios, "2026-04-17");

            System.out.println("model.Cliente: " + aluguel.getCliente().getNome());
            System.out.println("Total: " + aluguel.getValorTotal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Aluguel> lista = controller.buscarPorData("2026-04-17");

        System.out.println("Aluguéis do dia:");
        for (Aluguel a : lista) {
            System.out.println(a.getCliente().getNome() + " - " + a.getValorTotal());
        }
    }
}