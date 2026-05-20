package modulos.figuras;

import modulos.Medida;

public class Retangulo implements IFiguraPlana {
    
    private Medida  ladoMaior,
                    ladoMenor,
                    area,
                    perimetro;

    public Retangulo (Medida ladoMaior, Medida ladoMenor) {
        this.ladoMaior = ladoMaior;
        this.ladoMenor = ladoMenor;
    }
    public Retangulo (float valorMaior, float valorMenor, String unidade) {
        this.ladoMaior = new Medida(valorMaior, unidade);
        this.ladoMenor = new Medida(valorMenor, unidade);
    }

    public Medida getLadoMaior() {
        return ladoMaior;
    }

    public Medida getLadoMenor() {
        return ladoMenor;
    }

    @Override
    public Medida calcularArea() {
        float valorArea = ladoMaior.getValor() * ladoMenor.getValor();
        area = new Medida(valorArea, ladoMaior.getUnidade() + "²");
        return area;
    }

    @Override
    public Medida calcularPerimetro() {
        float valorPerimetro = (ladoMaior.getValor() * 2) + (ladoMenor.getValor() * 2);
        perimetro = new Medida(valorPerimetro, ladoMaior.getUnidade());
        return perimetro;
    }

}
