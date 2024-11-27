/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Beatriz Batista
 */
public class MatrizQuatro {
    public static void main(String[] args) {
        // Cria uma matriz 4x4 de decimais
        double[][] matriz = new double[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Math.random(); 
            }
        }
        
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][i]);
        }
        
        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][3 - i]);
        }
    }
}