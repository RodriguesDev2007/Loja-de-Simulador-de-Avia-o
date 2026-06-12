
package patterns.observer;

public interface IObserver {

    void atualizar(String mensagem);

    default void registrarEvento() {
        System.out.println("Evento registrado.");
    }
}
