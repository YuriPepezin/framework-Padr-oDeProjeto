package framework;

public abstract class TerrenoDecorator extends Terreno {
    protected Terreno terrenoDecorado;

    public TerrenoDecorator(Terreno terrenoDecorado) {
        super(terrenoDecorado.getTipo()); 
        this.terrenoDecorado = terrenoDecorado; 
    }

    @Override
    public void aplicarEfeito() {
        terrenoDecorado.aplicarEfeito(); 
    }
}
