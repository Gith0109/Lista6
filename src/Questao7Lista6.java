import java.util.Scanner;

public class Questao7Lista6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 10 elementos que serão multiplicados");
        int[] a = lerElementos(10, ler);

        System.out.println("Digite mais 10 elementos que vão ser o multiplicador");
        int[] b = lerElementos(10, ler);

        int[] c = multiplicar(a, b);
        imprimirMultiplicacao(a, b, c);
    }

    public static int[] lerElementos(int tamanho, Scanner ler) {
        int[] numeros = new int[tamanho];
        for (int x = 0; x < numeros.length; x++) {
            numeros[x] = ler.nextInt();
        }
        return numeros;
    }

    public static int[] multiplicar(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int x = 0; x < a.length; x++) {
            c[x] = a[x] * b[x];
        }
        return c;
    }

    public static void imprimirMultiplicacao(int[] a, int[] b, int[] c) {
        System.out.println("O resultado dessas multiplicação são:");
        for (int x = 0; x < c.length; x++) {
            c[x] = a[x] * b[x];
            System.out.printf("%d * %d = %d\n", a[x], b[x], c[x]);
        }
    }
}