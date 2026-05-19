package SamuelFuentes;

import java.util.Scanner;

public class Loading {

    public static void g1_loading(Scanner sc) {

        System.out.print("Ingrese un caracter: ");
        char c = sc.next().charAt(0);

        for (int i = 0; i <= 20; i++) {

            int porcentaje = i * 5;

            System.out.print("\r[");

            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }

            for (int j = i; j < 20; j++) {
                System.out.print(" ");
            }

            System.out.print("] " + porcentaje + "%");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 1");
        System.out.println("Integrante: Fuentes.Samuel");

        g1_loading(sc);

        sc.close();
    }
}