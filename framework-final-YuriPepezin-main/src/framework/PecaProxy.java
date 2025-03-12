package framework;

public class PecaProxy {
    private Peca pecaReal;

    public PecaProxy(Peca pecaReal) {
        this.pecaReal = pecaReal;
    }

    public void mover(int linha, int coluna) {
        if (podeMover()) {
            System.out.println(pecaReal + " moveu-se para (" + linha + ", " + coluna + ").");
        } else {
            System.out.println(pecaReal + " nao pode se mover.");
        }
    }

    private boolean podeMover() {
       
        return true; 
    }
}
