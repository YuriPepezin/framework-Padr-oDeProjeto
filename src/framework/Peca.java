package framework;

public class Peca implements InterfacePeca {
    private String nome;
    private EstrategiaMovimento estrategiaMovimento;

    public Peca(String nome) {
        this.nome = nome;
        this.estrategiaMovimento = new MovimentoPadrao(this); // Estratégia padrão inicialmente
    }

    public void setEstrategiaMovimento(EstrategiaMovimento estrategiaMovimento) {
        this.estrategiaMovimento = estrategiaMovimento;
    }

    @Override
    public void mover(int linha, int coluna) {
        estrategiaMovimento.mover(linha, coluna);
    }

    @Override
    public Peca clone() {
        try {
            return (Peca) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar a peça: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
