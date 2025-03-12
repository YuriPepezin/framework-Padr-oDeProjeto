package framework;


public interface InterfacePeca extends Cloneable {
    void mover(int linha, int coluna);

    InterfacePeca clone();
}
