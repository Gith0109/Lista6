import java.util.Scanner;

public class Questao1Lista6 {

    public static void main(String[] args) {

        int n1, n2;

        Scanner total = new Scanner(System.in);
        System.out.println("Calcular");
        n1 = total.nextInt();

        System.out.println("Calcular");
        n2 = total.nextInt();

        System.out.printf("Resultado: %d.", resultado(n1, n2));

    }

    public static int resultado(int n1, int n2) {
        return n1 + n2;
    }
}

