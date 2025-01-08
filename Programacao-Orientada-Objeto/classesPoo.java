public class classesPoo {
/*
    Classes
    Toda a estrutura de código na linguagem JAVA é distribuído em arquivos como extensão .java denominados de classe.

    As classes existentes em nosso projetos serão compostas por: 
        Identificador, Características e Comportamentos.

    * Classe (class): A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.

    * Identificador (identity): Propósito existencial aos objetos que serão criados.

    * Características (states): Também conhecido como ATRIBUTOS ou PROPRIEDADES, é toda informação que representa o estado do objeto.

    * Comportamentos (behavior): Também conhecido como AÇÕES ou MÉTODOS, é toda parte comportamental que um objeto dispõe.

    * Instanciar (new): É o ato de criar um objeto a partir de estrutura definia em uma classe.


    Para ilustrar as etapas de desenvolvimento orientada a objetos em JAVA, iremos reproduzer um ação em forma de código
        para explicar que primeiro criamos a estrutura correspondente para assim podermos cria-los com as 
        características e possibilidade de realização de ações (comportamentos) como se fosse no "mundo real".

    // Criando uma classe Student
    // Com todas as características e comportamentos aplicados

        public class Student {
        
        String name;
        int age
        Color color;
        Sex sex;

        void eating (Food food) {
        // NOSSO CODIGO AQUI
        }
        void drinking (Eat eat) {
        // NOSSO CODIGO AQUI
        }
        void running(){
        // NOSSO CODIGO AQUI
        }
    }

   ** No exemplo, NÃO estruturamos a classe Student com o padrão JAVA BEANS getters e setters.

    Seguindo alguma convenções, as nossas classes são classificadas como:

        * Classe de modelo (model): Classes que representem estruturas de domínio da aplicação,
            exemplo: Cliente, Pedido, Nota Fiscal e etc.
        
        * Classe de serviços (service): Classes que contém regras de negócio e validação de nossos sistemas.

        * Classe de repositório (repository): Classes que contém uma integração com bando de dados.

        * Classe de controle (controller): Classes que possuem a finalidade de disponibilizar alguma comunicação
            externa à nossa aplicação, tipo https web ou webservices.

        *Classe utilitária (util): Classe que contém recursos comuns à toda nossa aplicação.

        
  
 */


 public static void main(String[] args) throws Exception{

Student student1 = new Student(); // CRIANDO UM OBJETO NA APLICAÇÃO
    student1.name = "Jhon";
    student1.age = 12;
    student1.color = Color.FAIR;
    student1.sex = Sex.MALE;

Student student2 = new Student(); // CRIANDO UM OBJETO NA APLICAÇÃO
    student2.name = "Sophia";
    student2.age = 10;
    student2.color = Color.FAIR;
    student2.sex = Sex.FEMALE;

Student student3 = new Student(); // CRIANDO UM OBJETO NA APLICAÇÃO
    student3.name = "Lily";
    student3.age = 11;
    student3.color = Color.DARK;
    student3.sex = Sex.FEMALE;



    
 }
}