package poo;

public class visibilidadeRecurso {

    /*
     * Visibilidade dos Recursos
     * 
     * Modificadores
     * 
     * Em java, utilizamos três palavras reservadas e um conceito default (sem
     * nenhuma palavra reservada)
     * para definir os quatro tipos de visibilidade de atributos, métodos e até
     * mesmo classes
     * no que se refere ao acesso por outas classes. Iremos ilustrar do masi visível
     * ao
     * mais restrito tipo de visibilidade nos arquivos em nossos projetos.
     * 
     * Para uma melhor ilustração, iremos apresentar os conceitos de visibilidade de
     * recursos através do contexto
     * em uma lanchonete que vende lanche natural e suco.
     * 
     * MODIFICADOR PUBLIC
     * como o próprio nome representa, quando nossa classe, método e atributo é
     * definido como public, qualquer outro pacote pode visualizar tais recursos.
     * 
     * MODIFICADOR DEFAULT
     * O modificador default está fortemente associado a organização das classes por
     * pacotes, algumas inplementações não precisam estar disponíveis por todo o
     * projeto,
     * e é este modificador de acecsso que restringe a visibilidade por pacote.
     * Dentro do pacote lanchonete, iremos criar dois sub-pacotes para representar
     * a divisão do estabelecimento
     * 
     * LANCHONETE.ATENDIMENTO.COZINHA: pacote que contém classes da parte cozinha
     * da lanchonete e atendimentos.
     * LANCHONETE.AREA.CLIENTE: Pacote que contém classes relacionadas ao espaço do
     * cliente.
     * 
     * MODIFICADOR PRIVATE
     * Depois de reestruturar nosso estabelecimento (projeto), onde temos as
     * divisões (pacotes)
     * espaço do cliente e atendimento, chegou a hora de uma reflexão sobre a
     * visibilidade
     * ou modificadores de acesso.
     * 
     * Conhecemos as ações disponíveis nas classes Cozinheiro, Almoxarife, Atendente
     * e Cliente,
     * mesmo com a organização da visibilidade por pacote, será se realmente estas
     * classes
     * precisam ser tão explicitas?
     * 
     * Será que o Cozinheiro precisa saber que/como o Almoxarife controla as
     * entradas e saídas?
     * Que o Cliente precisar saber como o Atendente recebe o pedido para servir sua
     * mesa?
     * Que o atendente precisa saber que antes de pagar o Cliente consulta o saldo
     * do App?
     * 
     * Diante destes questionamentos, é que nossas classes precisam continuar
     * mantendo suas ações
     * (métodos) mas nem todas precisam ser vistas por ninguém.
     ** 
     * A VISIBILIDADE DE RECURSOS DA LINGUAGEM NÃO ESTÁ ASSOCIADA A INTERFACE
     * GRÁFICA, MAS SIM,
     * O QUE AS CLASSES CONSEGUEM ACESSAR UMAS DAS OUTRAS.
     */

    public static void main(String[] args) {

    }
}
