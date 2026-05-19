package SamuelFuentes;

import java.util.Scanner;

public class RecursionMultiplicacion {

    public static int g3_multiplicacionRecursiva(int a, int b) {

        if (b == 0) {
            return 0;
        }

        return a + g3_multiplicacionRecursiva(a, b - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Fuentes.Samuel");

        System.out.print("Ingrese a: ");
        int a = sc.nextInt();

        System.out.print("Ingrese b: ");
        int b = sc.nextInt();

        int resultado = g3_multiplicacionRecursiva(a, b);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}