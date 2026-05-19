package SamuelFuentes;

import java.util.Scanner;

public class EliminarVocal {

    public static void g1_eliminarVocal(Scanner sc) {

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingrese vocal a eliminar: ");
        char vocal = sc.next().charAt(0);

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (Character.toLowerCase(c) != Character.toLowerCase(vocal)) {
                resultado += c;
            }
        }

        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Fuentes.Samuel, Rodrigo.Montero");

        g1_eliminarVocal(sc);

        sc.close();
    }
}