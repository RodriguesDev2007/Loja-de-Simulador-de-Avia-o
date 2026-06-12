
package model;

public class Movimentacao {

    private String produto;
    private int quantidade;

    public Movimentacao(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void exibir() {
        System.out.println(produto + " - " + quantidade);
    }
}
