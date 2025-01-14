public class treinandoArrays {
    public static void main(String[] args) {
                
            int[] numeros = {1, 2, 3, 4, 5}; //declarando a array, pode ser de qualquer tipo, contando que seja devidamente identificada.
            numeros[2] = 10; //alterando o elemento para o número correspondente
            int mostrarNumeros = numeros[4]; //criando uma segunda int para puxar o item na lista da array principal.
            int mostrarNumeros1 = numeros[2];
            int tamanho = numeros.length; //criando uma int para imprimir o tamanho da array
    
            System.out.println(mostrarNumeros); //imprimindo a int que criou
            System.out.println(mostrarNumeros1);
            System.out.println("O tamanho da array é de: " + tamanho); //imprimindo o tamanho da array
            
    
        }
    
    }
    