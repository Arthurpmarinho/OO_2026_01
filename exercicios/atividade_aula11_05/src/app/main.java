package app;

import modulos.figuras.*;
import modulos.Solidos.*;

public class main {

	public static void main(String[] args) {
		
		// Agrupando figuras planas em um vetor utilizando a interface (Polimorfismo)
		IFiguraPlana[] figuras = new IFiguraPlana[] {
			new Quadrado(5, "cm"),
			new Circulo(3, "m"),
			new Retangulo(4, 2, "cm"),
			new Triangulo(4, 5, "m")
		};

		System.out.println("=== Figuras Planas ===");
		for (IFiguraPlana figura : figuras) {
			// O método getClass().getSimpleName() pega o nome da classe em execução (ex: "Quadrado", "Circulo")
			System.out.println("Tipo: " + figura.getClass().getSimpleName());
			System.out.println("Área: " + figura.calcularArea().getValor() + " " + figura.calcularArea().getUnidade());
			System.out.println("Perímetro: " + figura.calcularPerimetro().getValor() + " " + figura.calcularPerimetro().getUnidade());
			System.out.println("----------------------");
		}

		// Agrupando sólidos em um vetor utilizando a interface
		ISolidos[] solidos = new ISolidos[] {
			new Cubo(4, "cm"),
			new Cilindro(2, 5, "m"),
			new Paralelepipedo(2, 3, 4, "cm")
		};

		System.out.println("\n=== Sólidos ===");
		for (ISolidos solido : solidos) {
			System.out.println("Tipo: " + solido.getClass().getSimpleName());
			System.out.println("Área Total: " + solido.CalculaAreaTotal().getValor() + " " + solido.CalculaAreaTotal().getUnidade());
			System.out.println("Volume: " + solido.CalculaVolume().getValor() + " " + solido.CalculaVolume().getUnidade());
			System.out.println("----------------------");
		}

	}

}
