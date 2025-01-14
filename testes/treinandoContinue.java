public class treinandoContinue {
        public static void main(String[] args) {
            
            for(int i = -10; i<5; i++) {
                if ( i == 0)
                continue;
                System.out.println(1/i);
            }
        }
}

/*
 * A declaração continue faz com que a execução do programa continue voltando imediatamente para o 
 *  início do laço, porém para a próxima interação.
 */