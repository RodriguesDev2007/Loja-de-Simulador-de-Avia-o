
package patterns.observer;

public class NotificadorEstoque implements IObserver {

    private String nome;

    public NotificadorEstoque(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem){
        System.out.println(nome + ": " + mensagem);
    }
}
