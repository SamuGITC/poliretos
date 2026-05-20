package MeganRetos;

public class Figura09 {
    public static void main(String[] args) {

        int filas = 4;

        for (int i = 0; i < filas; i++) {

            // espacios de la izquierda
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print("  ");
            }

            System.out.print("_|");

            // espacios del centro
            for (int k = 0; k < i * 4; k++) {
                System.out.print(" ");
            }

            System.out.println("|_");
        }
    }

}
