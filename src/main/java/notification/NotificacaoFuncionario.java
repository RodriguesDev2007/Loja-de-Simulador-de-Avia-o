
package notification;

public class NotificacaoFuncionario implements INotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Funcionário recebeu: " + mensagem);
    }

    public void confirmarLeitura() {
        System.out.println("Leitura confirmada.");
    }
}
