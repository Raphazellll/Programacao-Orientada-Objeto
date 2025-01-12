import java.util.Scanner;

public class ForComScanner {

 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            System.out.println("Você digitou: " + numero);
        }

        scanner.close(); // Fechar o scanner ao final
    }
}

/*
 * Sim, você pode usar o laço for junto com o Scanner em Java para capturar entradas repetidamente. 
      Isso é útil quando você deseja solicitar várias entradas do usuário, como uma quantidade fixa de 
      valores ou até mesmo processar entradas dentro de um intervalo.
 */
