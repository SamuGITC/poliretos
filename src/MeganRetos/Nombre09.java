package MeganRetos;

import java.util.Scanner;

public class Nombre09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (i % 2 == 0) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += Character.toLowerCase(c);
            }
        }
        System.out.println("Salida: " + resultado);
    }

}
