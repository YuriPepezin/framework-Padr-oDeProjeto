package framework;

public class MovimentoPadrao implements EstrategiaMovimento {
    private Peca peca;

    public MovimentoPadrao(Peca peca) {
        this.peca = peca;
    }

    @Override
    public void mover(int linha, int coluna) {
        peca.mover(linha, coluna);
    }
}
