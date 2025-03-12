package framework;

import java.util.ArrayList;
import java.util.List;

public class JogoTabuleiro {
    private List<Peca> pecas;
    private EstadoJogo estado;
    private TerrenoHandler terrenoHandler; 

    public JogoTabuleiro() {
        this.pecas = new ArrayList<>();
        this.estado = new EmJogo();
        this.terrenoHandler = new TerrenoHandler(); 
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void decorarTerreno(Terreno terreno) {
        terrenoHandler.adicionarDecorator(new TerrenoDecorator(terreno) {}); 
    }

    public void iniciarJogo() {
        estado.iniciar(this);
    }

    public void pausarJogo() {
        estado.pausar(this);
    }

    public void setEstado(EstadoJogo novoEstado) {
        this.estado = novoEstado;
    }

    public EstadoJogo getEstado() {
        return this.estado;
    }

    public TabuleiroMemento salvar() {
        return new TabuleiroMemento(pecas, terrenoHandler.getTerrenoDecorado()); 
    }

    public void restaurar(TabuleiroMemento memento) {
        this.pecas = new ArrayList<>(memento.getPecasSalvas());
        terrenoHandler.setTerrenoDecorado(memento.getTerrenoSalvo()); 
    }

    public void mostrarTabuleiro() {
        System.out.println("Tabuleiro com as peças: " + pecas);
        System.out.println("Terreno Decorado: ");
        Terreno terrenoDecorado = terrenoHandler.getTerrenoDecorado(); 
        System.out.println("Tipo: " + terrenoDecorado.getTipo());
        terrenoDecorado.aplicarEfeito();
    }
}
