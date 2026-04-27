package fga0158;

import javax.swing.JOptionPane;

public class exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = JOptionPane.showInputDialog("Frase a ser analisada: ");
		String limpa = original.toLowerCase().replace(" ", "");
		char[] frase = limpa.toCharArray();
		boolean ispalindromo = true;
		for (int i = 0; i < frase.length/2; i++) {
			if(!(frase[i] == frase[frase.length -1 - i])) {
				ispalindromo = false;
				break;
			}
		
		}
		
		if(ispalindromo) {
			JOptionPane.showMessageDialog(null, "É um palíndromo");
		}
		else {
			JOptionPane.showMessageDialog(null, "Não é um palíndromo");
		}

	}

}
