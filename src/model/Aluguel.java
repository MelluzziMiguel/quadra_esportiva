package model;

import model.Cliente;
import model.Horario;

import java.util.List;

public class Aluguel {
    private int id;
    private Cliente cliente;
    private List<Horario> horarios;
    private double valorTotal;
    private String data;

    public Aluguel(int id, Cliente cliente, List<Horario> horarios, String data) {
        this.id = id;
        this.cliente = cliente;
        this.horarios = horarios;
        this.data = data;
        calcularTotal();
    }

    private void calcularTotal() {
        valorTotal = 0;
        for (Horario h : horarios) {
            valorTotal += h.getValor();
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }
}