package dominio;

import dominio.excecao.PedidoInvalidoException;

public class Entrega {
    private final String endereco;
    private final double peso;
    private final TipoFrete tipoFrete;
    private final String destinatario;

    public Entrega(String endereco, double peso, TipoFrete tipoFrete, String destinatario) {
        if (endereco == null || endereco.isBlank()) {
            throw new PedidoInvalidoException("Endereço é obrigatório");
        }
        if (peso <= 0) {
            throw new PedidoInvalidoException("Peso deve ser maior que zero");
        }
        if (tipoFrete == null) {
            throw new PedidoInvalidoException("Tipo de frete é obrigatório");
        }
        if (destinatario == null || destinatario.isBlank()) {
            throw new PedidoInvalidoException("Destinatário é obrigatório");
        }

        this.endereco = endereco;
        this.peso = peso;
        this.tipoFrete = tipoFrete;
        this.destinatario = destinatario;
    }

    public String getEndereco() { return endereco; }
    public double getPeso() { return peso; }
    public TipoFrete getTipoFrete() { return tipoFrete; }
    public String getDestinatario() { return destinatario; }
}
