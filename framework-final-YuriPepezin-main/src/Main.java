import framework.Jogador;
import framework.JogoFactory;
import framework.TabuleiroFacade;
import jogo.jogoselva.SelvaFactory;
import framework.JogoTabuleiro;
import framework.GerenciadorDePecas;
import framework.TabuleiroCaretaker;
import framework.PecaCache; 
import framework.Peca;

public class Main {
    public static void main(String[] args) {
        JogoFactory factory = new SelvaFactory();
        JogoTabuleiro tabuleiro = factory.criarJogo();
        GerenciadorDePecas gerenciadorPecas = new GerenciadorDePecas();
        
        TabuleiroFacade facade = new TabuleiroFacade(tabuleiro, gerenciadorPecas);
        facade.iniciarJogo();
        
        TabuleiroCaretaker caretaker = new TabuleiroCaretaker();
        caretaker.salvarEstado(tabuleiro);
        
        Jogador jogador1 = Jogador.JOGADOR1;
        Jogador jogador2 = Jogador.JOGADOR2;

        
        PecaCache pecaCache = new PecaCache();
        Peca elefante = pecaCache.getPeca("Elefante");
        jogador1.adicionarPeca(elefante);

        Peca leao = pecaCache.getPeca("Leão");
        jogador2.adicionarPeca(leao);

        System.out.println(jogador1);
        System.out.println(jogador2);

        
        facade.moverPeca(elefante, 3, 4);
        facade.moverPeca(leao, 2, 5);

        System.out.println("\n--- Estado atual do tabuleiro após movimentos ---");
        facade.iniciarJogo();

        System.out.println("\n--- Pausando o jogo ---");
        facade.pausarJogo();

        System.out.println("\n--- Tentando mover peças enquanto pausado ---");
        facade.moverPeca(elefante, 4, 5); 

        System.out.println("\n--- Restaurando o estado anterior ---");
        caretaker.desfazer(tabuleiro);

        System.out.println("\n--- Estado do tabuleiro após desfazer ---");
        facade.iniciarJogo();

        // Retomando o jogo
        System.out.println("\n--- Retomando o jogo ---");
        facade.iniciarJogo(); 
    }
}
