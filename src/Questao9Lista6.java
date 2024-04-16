import java.util.Scanner;

public class Questao9Lista6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = lerNumeros("Digite 10 números", 10, ler);
        int[] B = lerNumeros("Digite mais 10 números", 10, ler);
        int[] C = encontrarRepetidos(A, B);
        imprimirRepetidos(C);
    }


    public static int[] lerNumeros(String mensagem, int tamanho, Scanner ler) {
        System.out.println(mensagem);
        int[] n1 = new int[tamanho];
        for (int x = 0; x < n1.length; x++) {
            n1[x] = ler.nextInt();
        }
        return n1;
    }

    public static int[] encontrarRepetidos(int[] A, int[] B) {
        int[] C = new int[A.length];
        System.out.println("Os números que repetem em ambos são:");
        for (int x = 0; x < C.length; x++) {
            if (A[x] % B[x] == 0) {
                C[x] = A[x];
            }
        }
        return C;
    }

    public static void imprimirRepetidos(int[] C) {
        for (int x : C) {
            if (x != 0) {
                System.out.println(x);
            }
        }
    }
}