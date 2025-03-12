package jogo.jogocamelot;

import framework.EstrategiaMovimento;
import framework.Peca;

public class MovimentoSaltador implements EstrategiaMovimento {
    private Peca peca;

    public MovimentoSaltador(Peca peca) {
        this.peca = peca;
    }

    @Override
    public void mover(int x, int y) {
        peca.mover(x, y); 
        System.out.println("A peça pode pular sobre outras peças.");
    }
}
