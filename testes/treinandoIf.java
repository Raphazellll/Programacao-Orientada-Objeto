
import java.util.Scanner;

public class treinandoIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letra = scanner.nextLine();

        if (letra.equals("M")) 
            System.out.println("Esta é a letra certa: " + letra);
         else
            System.out.println("Letra não cadastrada. " + letra);

    }
}


/*
 * O problema no seu código está relacionado à comparação de strings em Java. Para comparar strings em Java, 
 * você deve usar o método equals() ou equalsIgnoreCase() (caso queira ignorar maiúsculas e minúsculas). 
 * O operador == compara referências de objetos, não o conteúdo das strings.
 */