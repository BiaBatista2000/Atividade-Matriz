/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
 /**
  *
  * @author Beatriz Batista
  */
 public class MatrizA {
 
    public static void main(String[] args) {
        char[][] matriz = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'l', 'm', 'n', 'o', 'p'},
            {'q', 'r', 's', 't', 'u'}
        };

        for (char[] linha : matriz) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}