package jogo.jogocamelot;


import framework.Terreno;
import framework.TerrenoDecorator;

public class FlorestaDecorator extends TerrenoDecorator {

    public FlorestaDecorator(Terreno terrenoDecorado) {
        super(terrenoDecorado);
    }

    @Override
    public void aplicarEfeito() {
        super.aplicarEfeito(); 
        System.out.println("Este terreno é uma floresta. Aumenta a defesa das pecas.");
    }
}
