/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Beatriz Batista
 */
public class MatrizSete {  
    public static void main(String[] args) {
    double[][] matriz = {
        {4.5, 5.2}, 
        {4.2, 1.1}
    };

    JOptionPane.showMessageDialog(null, "****** Imprimindo a matriz ******");

    StringBuilder resultado = new StringBuilder();

    for (int linha = 0; linha < 2; linha++) {
        for (int coluna = 0; coluna < 2; coluna++) {
            resultado.append("matriz[").append(linha).append("][").append(coluna).append("] = ").append(matriz[linha][coluna]).append(" ");
            resultado.append("\n");
        }
    }

    System.out.print(resultado.toString());
}
}