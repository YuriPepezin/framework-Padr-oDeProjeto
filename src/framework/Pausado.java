package framework;

public class Pausado implements EstadoJogo {

    @Override
    public void iniciar(JogoTabuleiro tabuleiro) {
        System.out.println("O jogo foi retomado.");
        tabuleiro.setEstado(new EmJogo());  
    }

    @Override
    public void pausar(JogoTabuleiro tabuleiro) {
        System.out.println("O jogo já está pausado.");
    }
}
