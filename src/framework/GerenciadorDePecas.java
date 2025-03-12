package framework;

public class GerenciadorDePecas {
    public void moverPeca(Peca peca, int linha, int coluna) {
        Command comando = new MoverPecaCommand(peca, linha, coluna); 
        executarComando(comando); 
    }

    public void executarComando(Command comando) {
        comando.executar(); 
    }
}
