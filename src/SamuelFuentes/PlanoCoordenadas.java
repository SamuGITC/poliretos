package SamuelFuentes;

public class PlanoCoordenadas {

    public static void g1_planoCoordenadas() {

        String nombre = "SAMUEL";

        int[] y = new int[nombre.length()];

        for (int x = 0; x < nombre.length(); x++) {
            y[x] = x + 1;
        }

        int maxY = y[y.length - 1];

        for (int fila = maxY; fila >= 0; fila--) {

            System.out.printf("%2d | ", fila);

            for (int col = 0; col < nombre.length(); col++) {

                if (y[col] == fila) {
                    System.out.print(nombre.charAt(col) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println("0 |________________");
    }

    public static void main(String[] args) {

        System.out.println("Grupo 3");
        System.out.println("Integrante: Fuentes.Samuel");

        g1_planoCoordenadas();
    }
}