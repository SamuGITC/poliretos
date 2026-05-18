import java.util.Scanner;

public class Figura {

    public static void g1_figura(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 1");
        System.out.println("Integrante: Fuentes.Samuel");

        System.out.print("Ingrese niveles: ");
        int n = sc.nextInt();

        g1_figura(n);

        sc.close();
    }
}