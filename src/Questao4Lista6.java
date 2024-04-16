import java.util.Scanner;

public class Questao4Lista6 {

        public static void main(String[] args) {

            int n1 , n2 ;

            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite dois números inteiros");
            n1 = leitor.nextInt();
            n2 = leitor.nextInt();
            NumeroMaior(n1, n2);

        }

    public static void NumeroMaior(int n1, int n2) {
        if (n1 > n2) {
            System.out.printf("%d é maior que %d\n", n1, n2);
        }else {
            System.out.printf("%d é maior que %d\n", n2, n1);
        }
    }
}

