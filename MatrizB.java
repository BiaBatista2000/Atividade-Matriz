/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
 /**
  *
  * @author Beatriz Batista
  */
 public class MatrizB {
 
    public static void main(String[] args) {
        int[][] matriz = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}