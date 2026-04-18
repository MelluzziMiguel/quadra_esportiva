package controller;

import model.Aluguel;
import model.Cliente;
import model.Horario;

import java.util.ArrayList;
import java.util.List;

public class AluguelController {

    private List<Aluguel> alugueis = new ArrayList<>();

    public Aluguel criarAluguel(int id, Cliente cliente, List<Horario> horarios, String data) {

        // verifica se algum horário já está ocupado
        for (Horario h : horarios) {
            if (h.isOcupado()) {
                throw new IllegalArgumentException("Horário já ocupado: " + h.getHora());
            }
        }

        // marca como ocupado
        for (Horario h : horarios) {
            h.setOcupado(true);
        }

        Aluguel aluguel = new Aluguel(id, cliente, horarios, data);
        alugueis.add(aluguel);

        return aluguel;
    }

    public List<Aluguel> buscarPorData(String data) {
        List<Aluguel> resultado = new ArrayList<>();

        for (Aluguel a : alugueis) {
            if (a.getData().equals(data)) {
                resultado.add(a);
            }
        }

        return resultado;
    }
}