package model;

public class Horario {
    private int id;
    private String hora;
    private double valor;
    private boolean ocupado;

    public Horario(int id, String hora, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.id = id;
        this.hora = hora;
        this.valor = valor;
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValor() {
        return valor;
    }

    public String getHora() {
        return hora;
    }
}