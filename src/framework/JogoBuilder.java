package framework;

public abstract class JogoBuilder {
    protected JogoTabuleiro tabuleiro;

    public void criarNovoTabuleiro() {
        tabuleiro = new JogoTabuleiro();
    }

    public JogoTabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public abstract void adicionarPecas();
    public abstract void adicionarTerrenos(); // Ajuste necessário para usar TerrenoHandler
}
