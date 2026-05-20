package modulos.Solidos;

import modulos.figuras.Retangulo;
import modulos.Medida;

public class Paralelepipedo implements ISolidos {
    
    private Retangulo   face1,
                        face2,
                        face3;
    private Medida  volume,
                    areaTotal,
                    base,
                    altura,
                    largura;

    public Paralelepipedo (Medida base, Medida altura, Medida largura) {
        this.base = base;
        this.altura = altura;
        this.largura = largura;
        this.face1 = new Retangulo(base, altura);
        this.face2 = new Retangulo(base, largura);
        this.face3 = new Retangulo(altura, largura);
    }

    public Paralelepipedo (float valorBase, float valorAltura, float valorLargura, String unidade) {
        this.base = new Medida(valorBase, unidade);
        this.altura = new Medida(valorAltura, unidade);
        this.largura = new Medida(valorLargura, unidade);
        this.face1 = new Retangulo(base, altura);
        this.face2 = new Retangulo(base, largura);
        this.face3 = new Retangulo(altura, largura);
    }

    public Medida getBase() {
        return base;
    }

    public Medida getAltura() {
        return altura;
    }

    public Medida getLargura() {
        return largura;
    }

    @Override
    public Medida CalculaVolume() {
        float valorVolume = base.getValor() * altura.getValor() * largura.getValor();
        volume = new Medida(valorVolume, base.getUnidade() + "³");
        return volume;
    }

    @Override
    public Medida CalculaAreaTotal() {
        float valorAreaTotal = (2 * face1.calcularArea().getValor()) +
        (2 * face2.calcularArea().getValor()) +
        (2 * face3.calcularArea().getValor());
        areaTotal = new Medida(valorAreaTotal, base.getUnidade() + "²");
        return areaTotal;
    }
}
