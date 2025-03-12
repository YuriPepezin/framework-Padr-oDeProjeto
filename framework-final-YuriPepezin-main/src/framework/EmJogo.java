package framework;

public class EmJogo implements EstadoJogo {

    @Override
    public void iniciar(JogoTabuleiro tabuleiro) {
        System.out.println("O jogo já está em andamento.");
    }

    @Override
    public void pausar(JogoTabuleiro tabuleiro) {
        System.out.println("O jogo foi pausado.");
        tabuleiro.setEstado(new Pausado());
    }
}
