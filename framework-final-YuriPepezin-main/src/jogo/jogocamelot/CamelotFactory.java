package jogo.jogocamelot;

import framework.JogoFactory;
import framework.JogoBuilder;

public class CamelotFactory extends JogoFactory {
    @Override
    protected JogoBuilder criarBuilder() {
        return new CamelotBuilder();
    }
}
