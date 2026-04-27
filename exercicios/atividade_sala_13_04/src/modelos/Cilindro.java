package modelos;

public class Cilindro {
	circulo base;
	medida	altura,
			areaSuperficie,
			volume;
	
	public Cilindro(float raio, float altura, String unidade) {
		this.altura = new medida(altura, unidade);
		base = new circulo (raio, unidade);
	}
	
	public Cilindro(circulo base, medida altura) {
		this.altura = altura;
		this.base = base;	
	}
	
	public medida calcularVolume() {
		medida areaBase = base.calcularArea();
		float valorVolume = areaBase.getValor() * altura.getValor();
		String unidadeVolume = altura.getUnidade() + "3";
		this.volume = new medida(valorVolume, unidadeVolume);
		return this.volume;
	}
	
	public medida calcularAreaSuperficie() {
		float valorArea = 	2 * base.calcularArea().getValor() + 
							base.calcularPerimetro().getValor()*altura.getValor();
		
		String unidade = base.calcularArea().getUnidade();
		this.areaSuperficie = new medida (valorArea, unidade);
		return this.areaSuperficie;
	}
}
