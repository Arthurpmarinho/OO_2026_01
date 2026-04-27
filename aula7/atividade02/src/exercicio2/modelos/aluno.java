package exercicio2.modelos;

public class aluno {
	String nome;
	String email;
	int ano, sequencia;
	matricula matricula;
	
	public aluno (String nome, String email, int ano, int sequencia) {
		this.nome = nome;
		
		this.email = email;
		
		this.matricula = new matricula(ano, sequencia);
	}
	
	public String relatorio() {
		String relatorio = "";
		relatorio += "NOME: " + nome + '\n';
		
		relatorio += "EMAIL: " + email + '\n';
		
		relatorio += "MATRICULA: " + matricula.getAno() + "/" 
									+ matricula.getSequencia() + '\n';
		
		return relatorio;
	}
	
	protected void finalize() throws Throwable {
		System.out.println(nome + " vai ser destruido!");
	}
	
}
