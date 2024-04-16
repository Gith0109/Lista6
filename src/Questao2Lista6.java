import java.util.Scanner;

public class Questao2Lista6 {
    public static void main(String[] args) {

        // Informações/Strings

        int n1, n2, n3, n4;

        //Imprimindo e Armanezando dados
        Scanner total = new Scanner(System.in);
        System.out.println("Calcular");
        n1 = total.nextInt();

        System.out.println("Calcular");
        n2 = total.nextInt();

        System.out.println("Calcular");
        n3 = total.nextInt();

        System.out.println("Calcular");
        n4 = total.nextInt();

        //Fórmula da soma de Strings e Resultado

        MediaAritmetica(n1, n2, n3, n4);
    }

    private static void MediaAritmetica(int n1, int n2, int n3, int n4) {
        int mod, resultado;
        float divisao;

        resultado = n1 + n2 + n3 + n4;
        divisao = (float) resultado / 4;
        mod = resultado % 4;

        System.out.printf("Resultado: %.2f (%d/%d)\n", divisao, resultado, 4);
        System.out.printf("Resto de: %d", mod);
    }
}
