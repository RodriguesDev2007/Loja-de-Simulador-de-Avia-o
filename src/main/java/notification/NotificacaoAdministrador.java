
package notification;

public class NotificacaoAdministrador implements INotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Administrador recebeu: " + mensagem);
    }

    public void gerarAlerta() {
        System.out.println("Alerta crítico gerado.");
    }
}
