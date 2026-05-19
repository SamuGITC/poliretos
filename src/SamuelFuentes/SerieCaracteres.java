package SamuelFuentes;

import java.util.Scanner;

public class SerieCaracteres {

    public static void g1_serieCaracteres(int n) {

        int cantidad = 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < cantidad; j++) {
                System.out.print("+");
            }

            System.out.print(" ");

            cantidad += 2;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Fuentes.Samuel, Rodrigo.Montero");

        System.out.print("Ingrese cantidad de términos: ");
        int n = sc.nextInt();

        g1_serieCaracteres(n);

        sc.close();
    }
}