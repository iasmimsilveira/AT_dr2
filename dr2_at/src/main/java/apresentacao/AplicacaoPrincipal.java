package apresentacao;

import dominio.Entrega;
import dominio.TipoFrete;
import negocio.FabricaCalculadoraFrete;
import negocio.ServicoDeEtiqueta;

public class AplicacaoPrincipal {
    public static void main(String[] args) {
        Entrega entrega = new Entrega("Rua Central, 456", 10.0, TipoFrete.PAD, "Iasmim Silveira");

        ServicoDeEtiqueta servico = new ServicoDeEtiqueta(
                FabricaCalculadoraFrete.criarCalculadora(entrega.getTipoFrete())
        );

        System.out.println(servico.gerarResumoPedido(entrega));
        System.out.println(servico.gerarEtiqueta(entrega));
    }
}
