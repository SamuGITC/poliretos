package MeganRetos;
public class Serieletra09 {
    /***
     * @programa: Serieletra09
     * @descripcion: Imprime los primeros 10 términos de la serie A, B, C, D, ...
     * @autor: Samuel Lucero
     */
public static void main(String[] args) {

        int a = 1;
        int b = 1;

        for (int i = 0; i < 6; i++) {

            char letra = (char) ('a' + i);

            int repeticiones;

            if (i < 2) {
                repeticiones = 1;
            } else {
                repeticiones = a + b;
                a = b;
                b = repeticiones;
            }

            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }

            System.out.print(" ");
        }
    }



}
