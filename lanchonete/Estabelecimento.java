
import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();

        // AÇÕES QUE O ESTABELECIMENTO PRECISA TER CIÊNCIA.
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();

        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }

}
