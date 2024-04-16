import java.util.Scanner;

public class Questao3Lista6 {

        public static void main(String[] args) {
            int numero;

            Scanner leitor = new Scanner(System.in);

            for (int i = 0; i < 2; i++) {
                System.out.println("Leitor par ou impar");
                numero = leitor.nextInt();
                ParouImpar(numero);
            }
        }

    public static void ParouImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Numero é par");
        } else {
            System.out.println("Numero é impar");
        }
    }
}

