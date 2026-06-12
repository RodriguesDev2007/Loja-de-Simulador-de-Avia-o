
package notification;

public interface INotificacao {

    void enviar(String mensagem);

    default void registrarLog(String mensagem){
        System.out.println("LOG: " + mensagem);
    }
}
