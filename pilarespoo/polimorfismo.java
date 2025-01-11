package pilarespoo;

public class polimorfismo {

    /*
     * Polimorfismo
     * Um mesmo comportamento de várias maneiras.
     * 
     * Podemos observar no contexto de Abstração e Herança que conseguimos criar uma
     * singularidade estrutural de nossos elementos. Isso quer dizer que qualquer
     * classe que
     * deseja representar um serviço de mensagens, basta estender a classe
     * ServicoMensagemInstantanea e
     * implementar os respectivos métodos abstratos. O que vale reforçar aqui é,
     * cada classe
     * terpa a mesma ação executanndo procedimentos de maneira especializada.
     * 
     * 
     * Modificador PROTECTED
     * 
     * Vamos para uma retrospectiva quanto ao requisito do nosso sistema de
     * mensagens instantâneas
     * desde a etapa de escapsulamento.
     * O nosso requisito solicita que além de Enviar e Receber Mensagens, precisamos
     * validar se o
     * aplicativo está conectado a internet (valirarConectividade) e salvar o
     * histórico de cada
     * mensagem (salvarHistoricoMensagem).
     * Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos
     * servidores cloud,
     * mas e quanto a validar se está conectado a internet? Não poderia ser um
     * mecanismo comum à
     * todos? Logo quallquer classe filha de ServicoMensagemInstantanea poderia
     * desfrutar através
     * de herança desta funcionalidade.
     ** 
     * Mas fica a reflexão do que aprendemos sobre visibilidade de recursos: Com o
     * modificador private
     * somente a classe conhece a implementação quanto que o modificador public,
     * todos passarão a
     * conhecer. Mas gostaríamos que comente as classes filha soubessem. É ai que
     * entra o modificador
     * PROTECTED.
     */

}
