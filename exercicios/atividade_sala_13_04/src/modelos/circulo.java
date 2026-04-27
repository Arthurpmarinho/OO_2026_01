package modelos;

public class circulo {
	//Atributos da classe circulo
	medida 	raio, 
			perimetro, 
			area;
	
	//Cronstrutores alternativos de circulo
	public circulo(float valor, String unidade) {
		raio = new medida(valor, unidade);
	}
	
	public circulo(medida raio) {
		this.raio = raio;
	}
	
	//metodos de um circulo
	public medida calcularPerimetro() {
		float valorRaio = raio.getValor();
		String unidadeRaio = raio.getUnidade();
		
		float valorPerimetro = 2 * 3.14f * valorRaio;
		
		perimetro = new medida(valorPerimetro, unidadeRaio);
		
		return perimetro;
	}
	
	public medida calcularArea() {
		area = new medida((float) (3.14f * Math.sqrt(raio.getValor())), "mm2");
		return area;
	}
}
