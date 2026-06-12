
package patterns.factory;

import patterns.visitor.*;

public abstract class ProdutoAviacao implements IElemento {

    protected String nome;
    protected int quantidade;

    public String getNome(){
        return nome;
    }

    @Override
    public void aceitar(Visitor visitor){
        visitor.visitar(nome);
    }
}
