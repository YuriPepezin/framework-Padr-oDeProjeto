package jogo.jogoselva;

import framework.JogoBuilder;
import framework.Peca;
import framework.Terreno;
import framework.TerrenoHandler;
import framework.TerrenoDecorator;

public class JogoSelvaBuilder extends JogoBuilder {

    @Override
    public void adicionarPecas() {
        tabuleiro.adicionarPeca(new Peca("Elefante"));
        tabuleiro.adicionarPeca(new Peca("Leão"));
        tabuleiro.adicionarPeca(new Peca("Tigre"));
        tabuleiro.adicionarPeca(new Peca("Leopardo"));
        tabuleiro.adicionarPeca(new Peca("Cão"));
        tabuleiro.adicionarPeca(new Peca("Lobo"));
        tabuleiro.adicionarPeca(new Peca("Gato"));
        tabuleiro.adicionarPeca(new Peca("Rato"));
    }

    @Override
    public void adicionarTerrenos() {
        
        Terreno terrenoNormal = new Terreno("Normal");

      
        TerrenoHandler terrenoHandler = new TerrenoHandler();
        
       
        TerrenoDecorator terrenoAgua = new TerrenoAgua(terrenoNormal); 
        TerrenoDecorator terrenoArmadilha = new TerrenoArmadilha(terrenoNormal); 
        
       
        terrenoHandler.adicionarDecorator(terrenoAgua);
        terrenoHandler.adicionarDecorator(terrenoArmadilha);
        
      
        tabuleiro.decorarTerreno(terrenoHandler.getTerrenoDecorado()); 
    }
}
