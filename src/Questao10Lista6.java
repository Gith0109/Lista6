import java.util.Random;

public class Questao10Lista6 {

    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = gerarMatrizAleatoria(7, 9, r);
        imprimirMatriz(a);

        int soma = calcularSomaMatriz(a);
        System.out.printf("A soma dos elementos dessa matriz é: %d", soma);
    }

    public static int[][] gerarMatrizAleatoria(int linhas, int colunas, Random r) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Uma matriz 7 x 9 vai ser gerada aleatoriamente:");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = r.nextInt(10);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d ", elemento);
            }
            System.out.println();
        }
    }

    public static int calcularSomaMatriz(int[][] matriz) {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }
        return soma;
    }
}
