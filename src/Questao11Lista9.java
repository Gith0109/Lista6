import java.util.Random;

public class Questao11Lista9 {
    public static void main(String[] args) {
        int[][] m = gerarMatriz(6, 8);
        imprimirMatriz(m);

        int[] c = contarNegativosPorLinha(m);
        imprimirContagemNegativosPorLinha(c);
    }

    public static int[][] gerarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = random.nextInt(21) - 10; // números aleatórios entre -10 e 10
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d ", elemento);
            }
            System.out.println();
        }
    }

    public static int[] contarNegativosPorLinha(int[][] matriz) {
        int[] contadorNegativos = new int[matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] < 0) {
                    contadorNegativos[x]++;
                }
            }
        }
        return contadorNegativos;
    }

    public static void imprimirContagemNegativosPorLinha(int[] contadorNegativos) {
        System.out.println("\nContagem de números negativos por linha:");
        for (int i = 0; i < contadorNegativos.length; i++) {
            System.out.printf("Na %dª linha tem: %d %s%n", i + 1, contadorNegativos[i], contadorNegativos[i] > 1 ? "números negativos" : "número negativo");
        }
    }
}

