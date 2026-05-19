package SamuelFuentes;

import java.util.Scanner;

public class Automata {

    public static void g1_automata(Scanner sc) {

        System.out.print("Ingrese cadena: ");
        String cadena = sc.next();

        boolean valido = cadena.matches("1+/0+1*");

        if (valido) {
            System.out.println("Cadena válida");
        } else {
            System.out.println("Cadena inválida");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo 3");
        System.out.println("Integrante: Fuentes.Samuel");

        g1_automata(sc);

        sc.close();
    }
}