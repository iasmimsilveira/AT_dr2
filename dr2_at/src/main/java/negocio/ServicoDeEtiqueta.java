package negocio;

import dominio.Entrega;

public class ServicoDeEtiqueta {

    private final CalculadoraDeFrete calculadoraFrete;

    public ServicoDeEtiqueta(CalculadoraDeFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public String gerarEtiqueta(Entrega entrega) {
        return String.format(
                "Destinatário: %s\nEndereço: %s\nValor do Frete: R$ %.2f",
                entrega.getDestinatario(),
                entrega.getEndereco(),
                calcularValorFrete(entrega)
        );
    }

    public String gerarResumoPedido(Entrega entrega) {
        return String.format(
                "Pedido para %s com frete tipo %s no valor de R$ %.2f",
                entrega.getDestinatario(),
                entrega.getTipoFrete(),
                calcularValorFrete(entrega)
        );
    }

    private double calcularValorFrete(Entrega entrega) {
        return calculadoraFrete.calcular(entrega);
    }
}
