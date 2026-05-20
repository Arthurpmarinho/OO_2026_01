package modulos.figuras;

import modulos.Medida;

public class Quadrado implements IFiguraPlana {
	
	private Medida lado;
	private Medida perimetro;
	private Medida area;
	
	public Quadrado (Medida lado) {
		
		this.lado = lado;
		
	}
	
	public Quadrado (float valor, String unidade) {
		this.lado = new Medida(valor,unidade);
	}
	
	public Medida getLado() {
		return lado;
	}

	public Medida calcularPerimetro() {
		
		perimetro = new Medida(lado.getValor() * 4, lado.getUnidade());
		return perimetro;
	}
	
	
	public Medida calcularArea() {
        float valorArea = (float) Math.pow((double) this.lado.getValor(), 2);
        area = new Medida(valorArea, this.lado.getUnidade() + "²");
        return area;
    }
	
}
