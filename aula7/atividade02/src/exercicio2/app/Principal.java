package exercicio2.app;

import javax.swing.JOptionPane;

import exercicio2.modelos.aluno;
import exercicio2.modelos.curso;

public class Principal {

	static curso c = new curso(); 

	public static void main(String[] args) {
		
		int opcao = 0; 
		do {
			String menu = ""; 
			menu += "Informe a opcao desejada: " + '\n'; 
			menu += "1 - Cadastrar aluno" + '\n';
			menu += "2 - Relatorio curso" + '\n';
			menu += "0 - Sair";
			
			String strOpcao = JOptionPane.showInputDialog(menu);
			opcao = Integer.parseInt(strOpcao);
			
			switch (opcao) {
			case 1: {
				System.gc();
				cadastrarAluno();
				break;
			}
			case 2: {
				JOptionPane.showMessageDialog(null, c.relatorioClasse());
			}
			case 0: {
				break;
			}
			default:
				opcao = -1; 
			}
			
		} while (opcao != 0);
	}

	private static void cadastrarAluno() {
		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String email = JOptionPane.showInputDialog("Email do aluno:");
		String strAno = JOptionPane.showInputDialog("Ano de matricula");
		String strSeq = JOptionPane.showInputDialog("Matricula");
		
		int ano = Integer.parseInt(strAno);
		int seq = Integer.parseInt(strSeq);
		
		aluno a = new aluno(nome, email, ano, seq);
		c.cadastrarAluno(a);
		
		JOptionPane.showMessageDialog(null, a.relatorio());
	}

}
