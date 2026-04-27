package fga0158;

import javax.swing.JOptionPane;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do vetor: "));
		int []vetor = new int[size];
		for (int i = 0; i < size; i++) {
			String resposta = "Valor da posicisão " + i + " :";
			int valor = Integer.parseInt(JOptionPane.showInputDialog(resposta));
			vetor[i] = valor;
		}
		
		media(vetor, size);
		valor_positivo(vetor,size);
		par_impar(vetor,size);
	}
	
	public static void media(int[] vetor, int size) {
		int soma = 0;
		for (int i = 0; i < size; i++) {
			soma += vetor[i];
		}
		float resultado =(float)soma/size;
		JOptionPane.showMessageDialog(null, "Média dos valores: " + resultado);
	}
	
	public static void valor_positivo(int[] vetor, int size) {
		int q_posit = 0;
		int zeros = 0;
		for (int i = 0; i < size; i++) {
			if(vetor[i] > 0) {
				q_posit++;
			}
			else if(vetor[i] == 0) {
				zeros++;
			}
		}
		JOptionPane.showMessageDialog(null, "Valores positivos: "  + q_posit);
		int neg = size - q_posit - zeros;
		JOptionPane.showMessageDialog(null, "Valores negativos: "  + neg);
		JOptionPane.showMessageDialog(null, "Valores zeros: "  + zeros);
	}
	
	public static void par_impar(int[] vetor, int size) {
		int q_par = 0;
		for (int i = 0; i < size; i++) {
			if(vetor[i]%2 == 0 ) {
				q_par++;
			}
		}
		JOptionPane.showMessageDialog(null, "Valores pares: "  + q_par);
		int q_impar = size - q_par;
		JOptionPane.showMessageDialog(null, "Valores impares: "  + q_impar);
		
	}
}
