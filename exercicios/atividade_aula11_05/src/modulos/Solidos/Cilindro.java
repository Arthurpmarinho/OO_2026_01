package modulos.Solidos;

import modulos.Medida;
import modulos.figuras.Circulo;

public class Cilindro implements ISolidos {
    
    private Circulo circulo;
    private Medida  volume,
                    areaTotal,
                    altura;

    public Cilindro (Medida raio, Medida altura) {
        this.circulo = new Circulo(raio);
        this.altura = altura;
    }

    public Cilindro (float valorRaio, float valorAltura, String unidade) {
        this.circulo = new Circulo(new Medida(valorRaio, unidade));
        this.altura = new Medida(valorAltura, unidade);
    }

    public Medida getRaio() {
        return circulo.getRaio();
    }

    public Medida getAltura() {
        return altura;
    }

    @Override
    public Medida CalculaVolume() {
        float valorVolume = circulo.calcularArea().getValor() * altura.getValor();
        volume = new Medida(valorVolume, circulo.getRaio().getUnidade() + "³");
        return volume;
    }

    @Override
    public Medida CalculaAreaTotal() {
        float valorAreaTotal = (2 * circulo.calcularArea().getValor()) + (2 * circulo.getRaio().getValor() * altura.getValor());
        areaTotal = new Medida(valorAreaTotal, circulo.getRaio().getUnidade() + "²");
        return areaTotal;
    }
}
