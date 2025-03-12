package jogo.jogoselva;

import framework.Terreno;
import framework.TerrenoDecorator;

public class TerrenoArmadilha extends TerrenoDecorator {

    public TerrenoArmadilha(Terreno terrenoDecorado) {
        super(terrenoDecorado);
    }

    @Override
    public void aplicarEfeito() {
        super.aplicarEfeito();
        System.out.println("Peça que cai na armadilha é removida do jogo.");
    }
}
