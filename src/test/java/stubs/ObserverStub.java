package stubs;

import patterns.observer.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * Stub de IObserver.
 * Captura as mensagens recebidas para verificação nos testes.
 */
public class ObserverStub implements IObserver {

    public List<String> mensagensRecebidas = new ArrayList<>();

    @Override
    public void atualizar(String mensagem) {
        mensagensRecebidas.add(mensagem);
    }
}
