

import java.util.Scanner;
public class treinandoScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        String sobrenNome = scanner.nextLine();
        int idade = scanner.nextInt();
        scanner.nextLine();
        String estado = scanner.nextLine();

        /* Sempre que for colocar um nextInt, colocar uma quebra de linha (nextLine).
         * O problema no seu código está relacionado ao comportamento do método nextLine() do Scanner. 
         * Após a leitura do inteiro idade com nextInt(), a entrada de quebra de linha (Enter) ainda está no buffer. 
         * Quando você chama nextLine() para capturar o estado, ele lê essa quebra de linha em vez de esperar pela entrada do usuário.
            Solução:
                Você pode adicionar uma chamada extra a scanner.nextLine() logo após a leitura de idade para consumir
                 a quebra de linha restante no buffer.
         */
        

        
        
        System.out.println("Bom dia. Me chamo " + nome +" "+ sobrenNome + ", tenho " + idade + " anos de idade. Moro no estado do " + estado + ".");
    }
}
