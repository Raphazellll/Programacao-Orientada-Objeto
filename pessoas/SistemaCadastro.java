package pessoas;

public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "Marcos");

        // Defubunis o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        // E como definir o nome e cpf do marcos ?

        // imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + " " + marcos.getCpf());
    }
}
