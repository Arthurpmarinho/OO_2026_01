package app;

import javax.swing.JOptionPane;

import modelos.Cilindro;
import modelos.circulo;
import modelos.medida;


public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		
		do {
			String menu = ""; 
			menu += "Informe a opcao desejada: " + '\n'; 
			menu += "1 - Cálculo do cílindro" + '\n';
			menu += "0 - Sair";
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opcao) {
			case 1: {
				float raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do raio: "));
				float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da altura: "));
				String unidade = JOptionPane.showInputDialog("Informe a medida: ");
				
				Cilindro obj1 = new Cilindro(raio, altura, unidade);
				
				float volume_valor = obj1.calcularVolume().getValor();
				String volume_unidade = obj1.calcularVolume().getUnidade();
				
				JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume_valor + " " + volume_unidade);
				

				break;
			}
			case 0: {
				break;
			}
			default:
				opcao = -1; 
			}
			
			
		}while(opcao != 0);
				
	
	}

}
