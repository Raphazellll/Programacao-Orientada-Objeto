package poo.gettersetter;
public class GetteSetters {

/* GETTERS SETTERS
    Seguindo a conversão Java Beans

    Os métodos "Getters" e "Setters" são utilizados para buscar valores
        de atributos ou definir novos valores de atributos de instrâncias
        de classes.
    
    O Método GETTER retorna o valor do atributo especificado.

    O Método SETTER define outro novo valor para o atributo especificado.

    Vemos o código abaixo da criação de um objeto Aluno com nome e idade.

        //Arquivo Aluno.Java // primeira classe criada
            public class Aluno {
            String nome;
            int idade;
        }
        //Arquivo Escola.Java //sendo uma outra classe
            public static void main(String[] args) {
            Aluno felipe = new Aluno();

            felipe.nome = "Felipe";
            felipe.idade = 8;

            System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos.");
            //resultado no console
            //O aluno Felipe tem 8 anos.
            
            }

    Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estado
        deverá seguir as regras abaixo:

    * Os atributos precisam ter o modificador de acesso private. Ex.: private String nome;
    
    * Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos 
        getX e setX, Ex.: getNome() e setNome(String novoNome);
    
    * O método GET é responsável por obter o valor atual do atributo, logo ele precisa ser PUBLIC,
        retornar um tipo correspondente ao valor, EX.: public String getNome() {};

    * O método SET é responsável por definir ou modificar o valor de um atributo em um objeto
        logo, ele também precisa ser PUBLIC, receber um parâmetro do mesmo tipo da variável, mas
        não retorna nenhum valor void. Ex.: public void setNome (String newNome);
    
//EXEMPLO ATUALIZADO
 
        //Arquivo Aluno.Java // primeira classe criada
        public class Aluno {
            private String nome;
            private int idade;
        
        public String getNome() {
            return nome
            }
        public void setNome (Strinh newNome) {
            if (alguma condição, se precisar)
            nome = newNome;
            }
        public int getIdade() {
            return idade
            }
        public void setIdade(int newIdade) {
            this.idade = newIdade;
            }
        }
========================================================================
        //Arquivo Escola.Java //sendo uma outra classe
            public static void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.setNome("Felipe");
            felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.setIdade() + " anos.");
        //retorno O aluno Felipe tem 8 anos.  
            
            }
    
 */
}
