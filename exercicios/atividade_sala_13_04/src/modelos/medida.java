package modelos;

public class medida {
	///Atributos de uma medida
	float valor;
	String unidade;
	
	public medida (float valor, String unidade) {
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
