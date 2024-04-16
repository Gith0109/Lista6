import java.util.Scanner;

public class Questao5Lista6 {

    public static void main(String[] args) {

        int NP = 0, NI = 0, NPSOMA = 0, NISOMA = 0, ler;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor inteiro e positivo: ");
        ler = leitor.nextInt();

        Somatorio numero = getNumero(ler, NP, NPSOMA, NI, NISOMA);
        System.out.println("A quantidade de números pares entre 1 e o valor digitado é:\n " + numero.NP());
        System.out.println("A soma de todos os números pares entre 1 e o valor digitado é:\n "+ numero.NPSOMA());
        System.out.println("A quantidade de números ímpar entre 1 e o valor digitado é:\n "+ numero.NI());
        System.out.println("A soma de todos os números ímpar entre 1 e o valor digitado é:\n "+ numero.NISOMA());
    }

    private static Somatorio getNumero(int ler, int NP, int NPSOMA, int NI, int NISOMA) {
        for (int x = 1; x <= ler; x++){
            if (x % 2 == 0) {
                NP++;
                NPSOMA += x;

            } else {
                NI++;
                NISOMA += x;
            }

        }
        return new Somatorio(NP, NI, NPSOMA, NISOMA);

    }

    private record Somatorio(int NP, int NI, int NPSOMA, int NISOMA) {
    }
}