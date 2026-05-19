
// F8 - Figura

package RodrigoMontero;

import java.util.Scanner;

public class Figura8 {

    public static void g3_figura8(int n) {

        for (int i = 0; i < n; i++) {

            System.out.print(" ___|");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Montero.Rodrigo");

        System.out.print("Ingrese niveles: ");
        int n = sc.nextInt();

        g3_figura8(n);

        sc.close();
    }
}