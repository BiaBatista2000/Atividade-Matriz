/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
 /**
  *
  * @author Beatriz Batista
  */
 public class MatrizC {
 
    public static void main(String[] args) {
        double[][] matriz = {
            {1.9, 2.5, 10.0},
            {1.0, 7.8, 2.5},
            {3.5, 2.2, 4.7}
        };

        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}