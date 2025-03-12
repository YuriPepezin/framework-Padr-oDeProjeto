package framework;

import java.util.List;

public class TabuleiroMemento {
    private final List<Peca> pecasSalvas;
    private final Terreno terrenoSalvo; // Atualizado para armazenar o terreno decorado

    public TabuleiroMemento(List<Peca> pecas, Terreno terreno) {
        this.pecasSalvas = List.copyOf(pecas);
        this.terrenoSalvo = terreno; // Armazena o terreno decorado
    }

    public List<Peca> getPecasSalvas() {
        return pecasSalvas;
    }

    public Terreno getTerrenoSalvo() {
        return terrenoSalvo; // Método para obter o terreno salvo
    }
}
