package modulos.Solidos;

import modulos.figuras.Quadrado;
import modulos.Medida;

public class Cubo implements ISolidos {
    
    private Quadrado quadrado;
    private Medida  volume,
                    areaTotal;

    public Cubo (Medida lado) {
        this.quadrado = new Quadrado(lado);
    }

    public Cubo (float valor, String unidade) {
        this.quadrado = new Quadrado(valor, unidade);
    }

    public Medida getLado() {
        return quadrado.getLado();
    }

    @Override
    public Medida CalculaVolume() {
        float valorVolume = (float) Math.pow(quadrado.getLado().getValor(), 3);
        volume = new Medida(valorVolume, quadrado.getLado().getUnidade() + "³");
        return volume;
    }

    @Override
    public Medida CalculaAreaTotal() {
        float valorAreaTotal = 6 * (float) Math.pow(quadrado.getLado().getValor(), 2);
        areaTotal = new Medida(valorAreaTotal, quadrado.getLado().getUnidade() + "²");
        return areaTotal;
    }
}
