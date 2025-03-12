package jogo.jogocamelot;

import framework.JogoBuilder;
import framework.Peca;
import framework.Terreno;

public class CamelotBuilder extends JogoBuilder {

    @Override
    public void adicionarPecas() {
        tabuleiro.adicionarPeca(new Peca("Cavalo1"));
        tabuleiro.adicionarPeca(new Peca("Cavalo2"));
        tabuleiro.adicionarPeca(new Peca("Cavalo3"));
        tabuleiro.adicionarPeca(new Peca("Cavalo4"));
        tabuleiro.adicionarPeca(new Peca("Peao1"));
        tabuleiro.adicionarPeca(new Peca("Peao2"));
        tabuleiro.adicionarPeca(new Peca("Peao3"));
        tabuleiro.adicionarPeca(new Peca("Peao4"));
    }

    @Override
    public void adicionarTerrenos() {
        
        Terreno terrenoInicial = new Terreno("Planície");
        tabuleiro.decorarTerreno(new MontanhaDecorator(terrenoInicial));
        tabuleiro.decorarTerreno(new FlorestaDecorator(terrenoInicial));
    }
}
