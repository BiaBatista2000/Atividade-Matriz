/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Beatriz Batista
 */
public class MatrizNove {
    public static void main(String[] args) {
        final int NUM_LINHAS = 3, NUM_COLUNAS = 3;
        int[][] matriz = new int[NUM_LINHAS][NUM_COLUNAS];

        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\nInforme os valores para cada posição da matriz");

        for (int linha = 0; linha < NUM_LINHAS; linha++) {
            for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
                boolean entradaValida = false;
                int valor = 0;
                while (!entradaValida) {
                    try {
                        String mensagem = String.format("Valor para a posição [%d, %d]:", linha + 1, coluna + 1);
                        valor = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
                        entradaValida = true; // Saída do loop se a entrada for válida
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido! Por favor, insira um número inteiro.");
                    }
                }
                matriz[linha][coluna] = valor;
            }
        }

        StringBuilder resultado = new StringBuilder("****** Dados da matriz ******\n");
        for (int linha = 0; linha < NUM_LINHAS; linha++) {
            for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
                resultado.append(matriz[linha][coluna]).append("\t");
            }
            resultado.append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
        System.out.println(resultado.toString());
    }
}