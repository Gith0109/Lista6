import java.util.Scanner;

public class Questao8Lista6 {


        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Escreva 10 elementos inteiros");
            int[] n1 = lerElementos(10, ler);

            int[] y = multiplicarParesImpares(n1);
            imprimirResultados(n1, y);
        }

        public static int[] lerElementos(int tamanho, Scanner ler) {
            int[] n1 = new int[tamanho];
            for (int x = 1; x < n1.length; x++) {
                n1[x] = ler.nextInt();
            }
            return n1;
        }

        public static int[] multiplicarParesImpares(int[] n1) {
            int[] y = new int[n1.length];
            for (int x = 1; x < y.length; x++) {
                if (x % 2 == 0) {
                    y[x] = n1[x] * 2;
                } else {
                    y[x] = n1[x] * 3;
                }
            }
            return y;
        }

        public static void imprimirResultados(int[] n1, int[] y) {
            System.out.println("Números pares foram multiplicados por 2, ímpares foram multiplicados por 3.\n");
            int n2;
            for (int x = 1; x < y.length; x++) {
                 if (x % 2 == 0) {
                     n2 = 2;
                 }else{
                     n2 = 3;
                }
                System.out.printf("%d x %d = %d\n", n1[x], n2, y[x]);
            }
        }
    }

