package modulos;

public class Medida {
	//Atributos da classe medida
	private float valor;
	private String unidade;
	
	public Medida (float valor, String unidade) {
		this.valor = valor;
		this.unidade = unidade;
	}

	public float getValor() {
		return valor;
	}

	public String getUnidade() {
		return unidade;
	}


}
