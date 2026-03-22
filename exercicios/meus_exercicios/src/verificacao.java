import javax.swing.JOptionPane;

public class verificacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numa = JOptionPane.showInputDialog("Número 'a': ");
		String numb = JOptionPane.showInputDialog("Número 'b': ");
		String numc = JOptionPane.showInputDialog("Número 'c': ");
		float a = Float.parseFloat(numa);
		float b = Float.parseFloat(numb);
		float c = Float.parseFloat(numc);
		boolean verific = Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2));
		JOptionPane.showMessageDialog(null, verific);
	}

}
