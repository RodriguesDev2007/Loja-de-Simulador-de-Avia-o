
package patterns.factory;

public class ProdutoFactory {

    public ProdutoAviacao criarJoystick(String nome, int quantidade){
        return new PecaSimulador(nome, quantidade);
    }

    public ProdutoAviacao criarPedal(String nome, int quantidade){
        return new PecaSimulador(nome, quantidade);
    }
}
