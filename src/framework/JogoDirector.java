package framework;

public class JogoDirector {
    private JogoBuilder builder;

    public JogoDirector(JogoBuilder builder) {
        this.builder = builder;
    }

    public void construirJogo() {
        builder.criarNovoTabuleiro();
        builder.adicionarPecas();
        builder.adicionarTerrenos();
    }

    public JogoTabuleiro getJogo() {
        return builder.getTabuleiro();
    }
}
