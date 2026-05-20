package MeganRetos;
/***
 * @programa: Serie09
 * @descripcion: Imprime los primeros 10 términos de la serie 2, 4, 8, 16, ...
 * @autor: Samuel Lucero
 * 
 */
public class Serie09 {
    public static void main(String[] args) {
        int n = 12; // Número de términos de la serie
        for (int i = 1; i <= n; i++) {
            int term = (int) Math.pow(2, i); // Calcula el término de la serie
            System.out.print(term + " "); // Imprime el término
        }
    }
    

}
