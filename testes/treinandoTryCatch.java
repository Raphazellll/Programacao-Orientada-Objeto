
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class treinandoTryCatch {
    public static void main(String[] args) {

        try { //colocar todo o código que precisa ser validado, pode ser um if, um while, um switch
            
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, me chamo " + nome + " " + sobreNome + ", tenho " + idade + " de idade.");
        System.out.println("Tenho " + altura + "cm de altura.");
        scanner.close();
    }catch (InputMismatchException e) { //colocar o tipo de erro, 
            System.out.println("Os campos idade e altura precisam ser numéricos.");
            
        }
        
    }
    }

//capturando o tipo de erro, posso passar uma mensagem avisando sobre o erro que está ocorrendo e assim, deixar o código
    //mais limpo.
