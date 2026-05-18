import java.util.Scanner;

public class SerieNumerica {

    public static void g1_serieNumerica(int n) {

        int a = 0, b = 1;

        System.out.println("\nSerie numérica:");

        for (int i = 0; i < n; i++) {

            int denominador = 2 * i + 1;

            System.out.print(a + "/" + denominador + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Fuentes.Samuel");

        System.out.print("Ingrese cantidad de términos: ");
        int n = sc.nextInt();

        g1_serieNumerica(n);

        sc.close();
    }
}