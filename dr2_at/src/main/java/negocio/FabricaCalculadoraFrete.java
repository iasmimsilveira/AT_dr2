package negocio;

import dominio.TipoFrete;

public class FabricaCalculadoraFrete {
    public static CalculadoraDeFrete criarCalculadora(TipoFrete tipoFrete) {
        return switch (tipoFrete) {
            case EXP -> new CalculadoraFreteExpresso();
            case PAD -> new CalculadoraFretePadrao();
            case ECO -> new CalculadoraFreteEconomico();
        };
    }
}
