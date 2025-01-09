public class pacotesJava {

    /*Pacotes
        A linguagem JAVA é composta por milhares de classes com as finalidades de, por exemplo:
            Classes de tipo de dados, representação de texto, números, datas, arquivos e diretórios, conexão a banco de dados entre outras.
            Imagina todas estas classes existirem em um único nível de documento? e as classes desenvolvidas por nós
            meros desenvolvedores de aplicação de vários os gêneros? imagina como ficaria este diretório em ?
        
        Para previnir este acontecimento, a linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós, que conhecemos
            como pacote (package). Os pacotes são subdiretórios a partir da pasta "src" do nosos projeto onde estão localizadas as classes
            da linguagem e novas que forem criadas para o projeto. Existe algumas convenções para criação de pacotes já utilizados no mercado.

        
    Nomenclatura
        Vamos imaginar que tenho uma empresa que se chama "Power Soft" e ela está desenvolvendo softwares comercial, gorvenamental e um software
            livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

        * Comercial: com.powersoft
        * Governamental: gov.powersoft
        * Código aberto: org.powersoft

    Acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as
        nossas classes mediante a proposta de sua existência:

        * model: Classes que representam a camada e modelo da aplicação:
            Cliente, Pedido, NotaFiscal, Usuario
        
        * repository: Classes ou interfaces que possuem a finalçidade de interagir com tabelas no banco de dados:
            ClienteRepository
        
        * service: Classes que contém regras de negócio do sistema:
            ClienteService possui o método validar o CPD do cliente cadastrado.

        * controller: Classes que possuem a finalidade de disponibilizar os nosso recursos da aplicação
            para outras aplicações via padrão HTTP.

        * view: Classes que possuem alguma interação com a interface gráfica acessada
            pelo usuário.

        * util: Pacote que contém classes utilitárias do sistema:
            FormatadorNumeroUtil, ValidadorUtil.
    
        

    Identificação
        Uma das características de uma classe é a sua identificação, Cliente, NotaFiscal, TituloPagar, porém quando
            esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simple (próprio nome)
            e agora o nome qualificado (endereçamento do pacote + nome), exemplo:
           
            A classe Usuario que está endereçada no pacote com.controle.acessi.model, o nome qualificado 
            desta classe é: com.controle.acesso.model.Usuario 

    Packege versus import
        A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém
            uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma
            classe existente em outros pacotes, necessitamos realizar a importação das mesmas, seguindo
            a recomendação abaixo veja:
        
        package

        import ...
        import ...

        public class MinhaClasse {
        
        }

        para criar um package (pacote de pastas) no vscode, crie as pastas nessa ordem:
        Package em sua essência nada mais é do que uma organização de pastas, para a organização do projeto. 
        Para a criação dos pacotes basta ir criando as pastas uma dentro da outra exemplo: 
        Crio a pasta br -> dentro dela crio a pasta com -> dentro da pasta com crio a pasta curso -> dentro a pasta model.

        e quando for criar a classe dentro da pasta model a declaração package ficaria : br.com.curso.model

        pode-se imporar uma classe de um pacote para outra classe diferente
        usando um método import com o nome da pasta, precisa saber o nome da classe que queira mover.
        exemplo: import br.com.curso.model.exame;

    Por que é tão importante compreender de pacotes?
        A linguagem JAVA é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas
            e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.
        
        É nesta hora, que nós desenvolvedores precismos detectar qual classe iremos importar em nosso projeto.

        Um exemplo classo é a existência das classas java.sql.Date e java.util.date da propria linguagem, recomendo
            você leitor pesquisar sobre a diferença das duas classes.


     */


     
    public static void main(String[] args) {
        
    }
}