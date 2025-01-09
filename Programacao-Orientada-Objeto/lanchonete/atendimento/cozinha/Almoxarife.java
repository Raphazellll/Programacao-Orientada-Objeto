package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() { // método private
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    void entregarIngredientes() { // método default
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarEntrada();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }

}
