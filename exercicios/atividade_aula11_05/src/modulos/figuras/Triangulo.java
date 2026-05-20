package modulos.figuras;

import modulos.Medida;

public class Triangulo implements IFiguraPlana {
    
    private Medida  base,
                    altura,
                    area,
                    perimetro;

    public Triangulo (Medida base, Medida altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo (float valorBase, float valorAltura, String unidade) {
        this.base = new Medida(valorBase, unidade);
        this.altura = new Medida(valorAltura, unidade);
    }

    public Medida getBase() {
        return base;
    }

    public Medida getAltura() {
        return altura;
    }

    @Override
    public Medida calcularArea() {
        float valorArea = (base.getValor() * altura.getValor()) / 2;

        area = new Medida(valorArea, base.getUnidade() + "²");
        
        return area;
    }

    @Override
    public Medida calcularPerimetro() {
        float valorPerimetro = base.getValor() + altura.getValor() +
        (float) Math.sqrt(Math.pow(base.getValor(), 2) + Math.pow(altura.getValor(), 2));

        perimetro = new Medida(valorPerimetro, base.getUnidade());

        return perimetro;
    }


}
