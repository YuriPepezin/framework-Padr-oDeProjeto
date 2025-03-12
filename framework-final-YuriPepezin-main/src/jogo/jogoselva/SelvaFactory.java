package jogo.jogoselva;

import framework.JogoBuilder;
import framework.JogoFactory;

public class SelvaFactory extends JogoFactory {
    @Override
    protected JogoBuilder criarBuilder() {
        return new JogoSelvaBuilder();
    }
}