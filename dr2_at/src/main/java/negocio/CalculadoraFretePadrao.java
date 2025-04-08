package negocio;

import dominio.Entrega;

public class CalculadoraFretePadrao implements CalculadoraDeFrete {
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.2;
    }
}
