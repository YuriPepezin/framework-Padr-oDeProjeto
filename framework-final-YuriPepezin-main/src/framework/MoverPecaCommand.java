package framework;

public class MoverPecaCommand implements Command {
    private Peca peca;
    private int linha;
    private int coluna;

    public MoverPecaCommand(Peca peca, int linha, int coluna) {
        this.peca = peca;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public void executar() {
        PecaProxy pecaProxy = new PecaProxy(peca);
        pecaProxy.mover(linha, coluna); 
    }
}