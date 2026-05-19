
// S8 - Serie Numerica
package RodrigoMontero;

import java.util.Scanner;

public class SerieNumerica8 {

    public static void g3_serieNumerica8(int n) {

        int num = 3;

        for (int i = 0; i < n; i++) {

            System.out.print(num + " ");

            num += 5;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Montero.Rodrigo");

        System.out.print("Ingrese cantidad de términos: ");
        int n = sc.nextInt();

        g3_serieNumerica8(n);

        sc.close();
    }
}