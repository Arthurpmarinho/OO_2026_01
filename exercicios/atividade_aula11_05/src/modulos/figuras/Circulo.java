package modulos.figuras;

import modulos.Medida;

public class Circulo implements IFiguraPlana {
	
	private Medida 	raio,
					area,
					perimetro;
	
	public Circulo (Medida raio) {
		this.raio = raio;
	}
	
	public Circulo (float valor, String unidade) {
		this.raio = new Medida(valor, unidade);
	}

	public Medida getRaio() {
		return raio;
	}
	
	public Medida calcularArea() {
		
		float valorArea = (float) (Math.PI * Math.pow(raio.getValor(), 2));
		area = new Medida(valorArea, raio.getUnidade() + "²");
		return area;
	}

	@Override
	public Medida calcularPerimetro() {
		
		float valorPerimetro = (float) (2* Math.PI * raio.getValor());
		perimetro = new Medida (valorPerimetro, raio.getUnidade());
		
		return perimetro;
	}

}
