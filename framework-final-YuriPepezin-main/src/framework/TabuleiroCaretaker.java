package framework;

import java.util.Stack;

public class TabuleiroCaretaker {
    private Stack<TabuleiroMemento> historico = new Stack<>();

    
    public void salvarEstado(JogoTabuleiro tabuleiro) {
        historico.push(tabuleiro.salvar());
    }

    public void desfazer(JogoTabuleiro tabuleiro) {
        if (!historico.isEmpty()) {
            TabuleiroMemento memento = historico.pop();
            tabuleiro.restaurar(memento);
        } else {
            System.out.println("Nenhum estado salvo disponível para desfazer.");
        }
    }
}
