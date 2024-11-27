/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Beatriz Batista
 */
public class MatrizFiguraA {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ' ';
            }
        }
        
        matriz[1][1] = '*';
        matriz[1][2] = '*';
        matriz[1][3] = '*';
        matriz[2][1] = '*';
        matriz[2][3] = '*';
        matriz[3][1] = '*';
        matriz[3][2] = '*';
        matriz[3][3] = '*';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}