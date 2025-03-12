package framework;

public class TabuleiroFacade {
    private JogoTabuleiro tabuleiro;
    private GerenciadorDePecas gerenciadorPecas;

    public TabuleiroFacade(JogoTabuleiro tabuleiro, GerenciadorDePecas gerenciadorPecas) {
        this.tabuleiro = tabuleiro;
        this.gerenciadorPecas = gerenciadorPecas;
    }

    public void iniciarJogo() {
        tabuleiro.iniciarJogo(); 
        tabuleiro.mostrarTabuleiro();
    }

    public void pausarJogo() {
        tabuleiro.pausarJogo(); 
    }

    // Modificado para receber um objeto Peca
    public void moverPeca(Peca peca, int linha, int coluna) {
        gerenciadorPecas.moverPeca(peca, linha, coluna); 
    }
}
