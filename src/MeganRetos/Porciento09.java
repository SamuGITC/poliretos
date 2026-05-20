package MeganRetos;

import java.util.Scanner;

public class Porciento09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa nombre completo: ");
        String nombre = sc.nextLine();

        // quitar espacios
        nombre = nombre.replace(" ", "");

        int n = nombre.length();

        int porcentaje = 0;
        int incremento = 100 / n;

        for (int i = 0; i < n; i++) {

            porcentaje += incremento;

            // asegurar que el último sea 100%
            if (i == n - 1) {
                porcentaje = 100;
            }

            char letra = nombre.charAt(i);

            System.out.println(letra + " " + porcentaje + "%");
        }
    }

}
