import java.util.Scanner;

public class Questao12Lista9 {
    public static void main(String[] args) {
        int[][] M = lerMatriz(10, 10);
        imprimirMatriz(M);

        int somaDiagonal = calcularSomaDiagonalPrincipal(M);
        
        float mediaDiagonal = calcularMediaDiagonalPrincipal(M);
        imprimirResultado(somaDiagonal, mediaDiagonal);
    }

    public static int[][] lerMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Scanner ler = new Scanner(System.in);
        System.out.println("Coloque os elementos para a construção da matriz M " + linhas + " x " + colunas + ":\n");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = ler.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("A matriz M:\n");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%2d", elemento);
            }
            System.out.println();
        }
    }

    public static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static float calcularMediaDiagonalPrincipal(int[][] matriz) {
        int soma = calcularSomaDiagonalPrincipal(matriz);
        return (float) soma / matriz.length;
    }

    public static void imprimirResultado(int somaDiagonal, float mediaDiagonal) {
        System.out.printf("A soma da diagonal principal da matriz M:\n %d\n", somaDiagonal);
        System.out.print("A média da diagonal principal da matriz M:\n ");
        if (mediaDiagonal == (int) mediaDiagonal) {
            System.out.printf("%.0f\n", mediaDiagonal);
        } else {
            System.out.printf("%.2f\n", mediaDiagonal);
        }
    }
}