package framework;

import java.util.ArrayList;
import java.util.List;

public enum Jogador {
    JOGADOR1, JOGADOR2;

    private List<Peca> pecas;

    Jogador() {
        this.pecas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        try {
            this.pecas.add(peca.clone());
        } catch (RuntimeException e) {
            System.err.println("Erro ao adicionar a peca: " + e.getMessage());
        }
    }

    public List<Peca> getPecas() {
        return new ArrayList<>(pecas);
    }

    @Override
    public String toString() {
        return name() + " com pecas: " + pecas;
    }
}
