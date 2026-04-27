package fga0158;

import javax.swing.JOptionPane;
import java.lang.Math;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcao = JOptionPane.showInputDialog("Escolha a figura desejada \n"
												    + "1 - Círculo \n"
												    + "2 - Quadrado \n"
												    + "3 - Retângulo \n"
												    + "4 - Trapézio \n"
												    + "5 - Triângulo ");
		int num_op = Integer.parseInt(opcao);
		double area = 0;
		double perimetro = 0;
		String figura = "";
		
		switch (num_op) {
	    case 1:
	        String sraio = JOptionPane.showInputDialog("Valor do raio: ");
	        int raio = Integer.parseInt(sraio);
	        area = Math.PI * Math.pow(raio, 2);
	        perimetro = 2 * Math.PI * raio;
	        figura = "circulo";
	        mostrar_resultado(area, perimetro, figura);
	        break;
	    case 2:
	    	String slado = JOptionPane.showInputDialog("Valor do lado: ");
	        int lado = Integer.parseInt(slado);
	        area =  Math.pow(lado, 2);
	        perimetro =  4*lado;
	        figura = "quadrado";
	        mostrar_resultado(area, perimetro, figura);
	        break;
	    case 3:
	    	String slado_a = JOptionPane.showInputDialog("Valor do lado a: ");
	        int lado_a = Integer.parseInt(slado_a);
	        String slado_b = JOptionPane.showInputDialog("Valor do lado b: ");
	        int lado_b = Integer.parseInt(slado_b);
	        area =  lado_a*lado_b;
	        perimetro =  2*lado_a + 2*lado_b;
	        figura = "retângulo";
	        mostrar_resultado(area, perimetro, figura);
	        break;
	    case 4: 
	    	int b_maior = Integer.parseInt(JOptionPane.showInputDialog("Base maior: "));
	        int b_menor = Integer.parseInt(JOptionPane.showInputDialog("Base menor: "));
	        int h = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
	        int l1 = Integer.parseInt(JOptionPane.showInputDialog("Lado lateral 1: "));
	        int l2 = Integer.parseInt(JOptionPane.showInputDialog("Lado lateral 2: "));
	        area = (b_maior + b_menor) * h / 2.0;
	        perimetro = b_maior + b_menor + l1 + l2;
	        figura = "trapézio";
	        mostrar_resultado(area, perimetro, figura);
	        break;
	    case 5:
	    	String sladoa = JOptionPane.showInputDialog("Valor do lado a : ");
	        int ladoa = Integer.parseInt(sladoa);
	        String sladob = JOptionPane.showInputDialog("Valor do lado b: ");
	        int ladob = Integer.parseInt(sladob);
	        String sladoc = JOptionPane.showInputDialog("Valor do lado c:  ");
	        int ladoc = Integer.parseInt(sladoc);
	        if (!(isvalid(ladoa, ladob, ladoc))) {
	        	JOptionPane.showMessageDialog(null, "Opção Inválida!");
	        	break;
	        }
	        area =  (ladoa + ladob)/2;
	        perimetro =  ladoa + ladob + ladoc;
	        figura = "trapézio";
	        mostrar_resultado(area, perimetro, figura);
	    	break;
	    default:
	        JOptionPane.showMessageDialog(null, "Opção Inválida!");
	        break;
	}
	
	

		
	}
	
	public static void mostrar_resultado(double area, double perimetro, String figura)
	{
		
		String resultado = "O perímetro do " + figura + " é " + perimetro + " e a área é " + area;
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static boolean isvalid(int arg1, int arg2, int arg3)
	{
		boolean result = true;
		int valor [];
		valor =  new int[3];
		valor[0]=arg1;
		valor[1]=arg2;
		valor[2]=arg3;
		for (int i = 0; i < 3; i++) {
		    double atual = valor[i];
		    double outro1 = valor[(i + 1) % 3]; // Pega o próximo índice (se for 2, volta pro 0)
		    double outro2 = valor[(i + 2) % 3]; // Pega o próximo do próximo

		    if (!(Math.abs(outro1 - outro2) < atual && atual < (outro1 + outro2))) {
		        result = false;
		        break; 
		    }
		    
		}
		
		return result;
	}

}
