import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Digite seu nome: ");
		
		String resposta = "Olá " + name + ", seja bem vindo.";
				
		System.out.println(resposta);
		JOptionPane.showMessageDialog(null,resposta);
	}

}
