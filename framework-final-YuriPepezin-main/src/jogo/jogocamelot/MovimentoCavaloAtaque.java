package jogo.jogocamelot;

import framework.EstrategiaMovimento;
import framework.Peca;

public class MovimentoCavaloAtaque implements EstrategiaMovimento {
    private Peca peca;

    public MovimentoCavaloAtaque(Peca peca) {
        this.peca = peca;
    }

    @Override
    public void mover(int x, int y) {
        peca.mover(x, y); 
        System.out.println("A peça pode fazer dois pulos e atacar outra peça.");
    }
}
