
package patterns.factory;

public class PecaSimulador extends ProdutoAviacao {

    public PecaSimulador(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return nome + " - " + quantidade;
    }
}
