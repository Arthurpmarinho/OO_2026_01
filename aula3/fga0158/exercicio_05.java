package fga0158;

import javax.swing.JOptionPane;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = Integer.parseInt(JOptionPane.showInputDialog("Valor M: "));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Valor N: "));
		int q = Integer.parseInt(JOptionPane.showInputDialog("Valor Q: "));
		int p = Integer.parseInt(JOptionPane.showInputDialog("Valor P: "));
		
		if (n != q) {
            JOptionPane.showMessageDialog(null, "Erro: O número de colunas deve ser igual às linhas");
            return; 
        }
		
		int[][] matriz_a = new int[m][n];
		int[][] matriz_b = new int[q][p];
		int[][] result = new int[m][p];
		
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz_a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("A["+i+"]["+j+"]: "));
            }
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < p; j++) {
                matriz_b[i][j] = Integer.parseInt(JOptionPane.showInputDialog("B["+i+"]["+j+"]: "));
            }
        }
		
		
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < p; j++) { 
                for (int k = 0; k < n; k++) {
                    result[i][j] += matriz_a[i][k] * matriz_b[k][j];
                }
            }
        }
     
	     for (int i = 0; i < m; i++) {
	         System.out.print("| "); 
	         for (int j = 0; j < p; j++) {
	             System.out.printf("%5d ", result[i][j]);
	         }
	         System.out.println(" |"); 
	     }
		
	}
	
	
	

}
