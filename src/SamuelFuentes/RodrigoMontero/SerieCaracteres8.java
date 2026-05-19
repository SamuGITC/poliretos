
// S8 - Serie Caracteres
package RodrigoMontero;

import java.util.Scanner;

public class SerieCaracteres8 {

    public static void g3_serieCaracteres8(int n) {

        char letra = 'a';
        int cantidad = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < cantidad; j++) {

                System.out.print(letra);
            }

            System.out.print(" ");

            letra++;
            cantidad += 2;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Montero.Rodrigo");

        System.out.print("Ingrese términos: ");
        int n = sc.nextInt();

        g3_serieCaracteres8(n);

        sc.close();
    }
}