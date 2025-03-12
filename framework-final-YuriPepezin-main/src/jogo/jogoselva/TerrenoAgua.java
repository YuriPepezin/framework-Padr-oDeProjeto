package jogo.jogoselva;

import framework.Terreno;
import framework.TerrenoDecorator;

public class TerrenoAgua extends TerrenoDecorator {

    public TerrenoAgua(Terreno terrenoDecorado) {
        super(terrenoDecorado);
    }

    @Override
    public void aplicarEfeito() {
        super.aplicarEfeito();
        System.out.println("Movimento restrito, as peças não podem atravessar.");
    }
}
