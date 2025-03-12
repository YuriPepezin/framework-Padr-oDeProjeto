package framework;

public class TerrenoHandler {
    private Terreno terrenoDecorado; // Mantém a referência ao terreno decorado

    public TerrenoHandler() {
        // Construtor padrão
    }

    public void adicionarDecorator(TerrenoDecorator decorador) {
        if (terrenoDecorado == null) {
            terrenoDecorado = decorador; // Se não houver terreno, inicia com o decorador
        } else {
            // Caso o terreno já tenha um decorador, empilha o novo
            terrenoDecorado = new TerrenoDecorator(terrenoDecorado) {}; // Instancia um novo decorador
        }
    }

    public Terreno getTerrenoDecorado() {
        return terrenoDecorado; // Retorna o terreno decorado
    }

    public void setTerrenoDecorado(Terreno terreno) {
        this.terrenoDecorado = terreno; // Método para definir o terreno decorado
    }
}
