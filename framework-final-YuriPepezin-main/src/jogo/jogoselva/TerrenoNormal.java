package jogo.jogoselva;

import framework.Terreno;
import framework.TerrenoDecorator;

public class TerrenoNormal extends TerrenoDecorator {

    public TerrenoNormal(Terreno terrenoDecorado) {
        super(terrenoDecorado);
    }

    @Override
    public void aplicarEfeito() {
        super.aplicarEfeito();
        System.out.println("Sem efeito especial.");
    }
}
