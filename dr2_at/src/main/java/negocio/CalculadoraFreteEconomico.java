package negocio;

import dominio.Entrega;

public class CalculadoraFreteEconomico implements CalculadoraDeFrete {
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.1 - 5.0;
    }
}
