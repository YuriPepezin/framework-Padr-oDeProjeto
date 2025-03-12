import framework.JogoTabuleiro;
import framework.Jogador;
import framework.TabuleiroFacade;
import jogo.jogocamelot.CamelotFactory;
import framework.JogoFactory;
import framework.Peca;
import jogo.jogocamelot.MovimentoCavaloAtaque;
import jogo.jogocamelot.MovimentoSaltador;
import framework.GerenciadorDePecas;
import framework.PecaCache;

public class MainCamelot {
    public static void main(String[] args) {
        JogoFactory factory = new CamelotFactory();
        JogoTabuleiro tabuleiro = factory.criarJogo();
        GerenciadorDePecas gerenciadorPecas = new GerenciadorDePecas();
        
        TabuleiroFacade facade = new TabuleiroFacade(tabuleiro, gerenciadorPecas);
        facade.iniciarJogo();

        Jogador jogador1 = Jogador.JOGADOR1;
        Jogador jogador2 = Jogador.JOGADOR2;

       
        PecaCache pecaCache = new PecaCache();

        
        Peca cavaloComAtaque = pecaCache.getPeca("Cavalo");
        cavaloComAtaque.setEstrategiaMovimento(new MovimentoCavaloAtaque(cavaloComAtaque));
        jogador1.adicionarPeca(cavaloComAtaque);

        Peca saltador = pecaCache.getPeca("Saltador");
        saltador.setEstrategiaMovimento(new MovimentoSaltador(saltador));
        jogador1.adicionarPeca(saltador);

        Peca peao = pecaCache.getPeca("Peao");
        jogador2.adicionarPeca(peao);

        System.out.println(jogador1);
        System.out.println(jogador2);

     
        facade.moverPeca(cavaloComAtaque, 3, 4); 
        facade.moverPeca(peao, 2, 5); 
    }
}
