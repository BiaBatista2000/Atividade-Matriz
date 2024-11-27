/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
 import java.util.Scanner;
 /**
  *
  * @author Beatriz Batista
  */
 public class MatrizDois {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[5][5];
            int somaImpares = 0;
    
            System.out.println("Digite os valores para preencher a matriz 5x5:");
    
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                    if (matriz[i][j] % 2 != 0) {
                        somaImpares += matriz[i][j];
                    }
                }
            }
    
            int[] somaColunas = new int[5];
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 5; i++) {
                    somaColunas[j] += matriz[i][j];
                }
            }
    
            int[] somaLinhas = new int[5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    somaLinhas[i] += matriz[i][j];
                }
            }
    
            System.out.println("\nA matriz fornecida:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
    
            System.out.println("\nA soma dos números ímpares: " + somaImpares);
    
            System.out.println("\nA soma de cada uma das 5 colunas:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
            }
    
            System.out.println("\nA soma de cada uma das 5 linhas:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
            }
    
            scanner.close();
        }
    }
    