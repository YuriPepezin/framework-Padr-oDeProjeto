package jogo.jogocamelot;

import framework.Terreno;
import framework.TerrenoDecorator;

public class MontanhaDecorator extends TerrenoDecorator {

    public MontanhaDecorator(Terreno terrenoDecorado) {
        super(terrenoDecorado);
    }

    @Override
    public void aplicarEfeito() {
        super.aplicarEfeito(); 
        System.out.println("Este terreno é uma montanha. Dificulta o movimento das peças.");
    }
}