public class Questao6Lista6 {

    public static void main(String[] args) {

        int[] b = Calculo();
        ImprimirPareImpar(b);

    }

    private static int[] Calculo() {
        int[] b = new int[10];
        for (int x = 0; x < b.length; x++) {
            if (x % 2 == 0) {
                b[x] = 20;
            } else {
                b[x] = 10;
            }
        }
        return b;
    }

    public static void ImprimirPareImpar(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d Par\n", numero[i]);
            } else {
                System.out.printf("%d Impar\n", numero[i]);
            }
        }
    }
}
