package negocio;

import dominio.Entrega;

public class CalculadoraFreteExpresso implements CalculadoraDeFrete {
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.5 + 10.0;
    }
}
