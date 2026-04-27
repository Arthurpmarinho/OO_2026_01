package exercicio2.modelos;

public class curso {
	private aluno alunos[] = new aluno[0];
	
	public void cadastrarAluno(aluno a) {
		aluno temp[] = new aluno[alunos.length + 1];
		
		for(int i = 0; i < alunos.length; i++) {
			temp[i] = alunos[i];
		}
		
		temp[alunos.length] = a;
		
		alunos = temp;
	}
	
	public Object relatorioClasse () {
		String resposta = "RELATORIO DO CURSO \n";
		resposta += "Alunos matriculados: \n\n";
		for (int i = 0; i < alunos.length; i++) {
			resposta += alunos[i].relatorio();
		}
		
		return resposta;
	}
}
