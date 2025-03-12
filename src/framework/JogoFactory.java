package framework;

public abstract class JogoFactory {
    public JogoTabuleiro criarJogo() {
        JogoBuilder builder = criarBuilder();
        JogoDirector director = new JogoDirector(builder);
        director.construirJogo();
        return director.getJogo();
    }

    protected abstract JogoBuilder criarBuilder();
}
