/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Beatriz Batista
 */
public class MatrizOito {
    public static void main(String[] args) {
        int[][] matriz = {
            {14, 42, 23, 14, 51},
            {22, 32, 55, 54, 12}
        };

        JOptionPane.showMessageDialog(null, "****** Exibindo somente os elementos pares da matriz ******");

        StringBuilder resultado = new StringBuilder();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] % 2 == 0) {
                    resultado.append(matriz[linha][coluna]).append(" ");
                } else {
                    resultado.append("- ");
                }
            }
            resultado.append("\n");
        }

        System.out.print(resultado.toString());
    }
}