/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
import java.util.HashSet;
/**
 *
 * @author Beatriz Batista
 */
public class MatrizTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        boolean possuiRepetidos = false;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Digite os valores para preencher a matriz 3x5:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                int valor = scanner.nextInt();
                matriz[i][j] = valor;

                if (elementos.contains(valor)) {
                    possuiRepetidos = true;
                } else {
                    elementos.add(valor);
                }

                if (valor % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        System.out.println("\nA matriz fornecida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nA matriz possui elementos repetidos? " + (possuiRepetidos ? "Sim" : "Não"));
        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);

        scanner.close();
    }
}
     