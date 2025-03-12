package framework;

public class Terreno {
    private String tipo;

    public Terreno(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void aplicarEfeito() {
        System.out.println("Efeito do terreno: " + tipo);
    }
}
