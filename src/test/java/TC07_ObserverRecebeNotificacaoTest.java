import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.observer.EstoqueSubject;
import stubs.ObserverStub;

/**
 * TC07 – Padrão Observer
 * Verifica que o observer recebe a notificação ao alterar o nível do estoque.
 */
public class TC07_ObserverRecebeNotificacaoTest {

    @Test
    @DisplayName("TC07 – Observer recebe notificação ao alterar nível")
    void tc07_observerRecebeNotificacao() {
        EstoqueSubject subject = new EstoqueSubject();
        ObserverStub stub = new ObserverStub();
        subject.adicionarObservador(stub);

        subject.alterarNivel(5);

        assertEquals(1, stub.mensagensRecebidas.size());
        assertTrue(stub.mensagensRecebidas.get(0).contains("5"));
    }
}
