/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Beatriz Batista
 */
public class MatrizFiguraC {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];
        
        // Preenche a matriz com espaços
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ' ';
            }
        }
        
        matriz[1][3] = '*';
        matriz[2][2] = '*';
        matriz[2][3] = '*';
        matriz[3][1] = '*';
        matriz[3][2] = '*';
        matriz[3][3] = '*';
        matriz[4][0] = '*';
        matriz[4][1] = '*';
        matriz[4][2] = '*';
        matriz[4][3] = '*';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}