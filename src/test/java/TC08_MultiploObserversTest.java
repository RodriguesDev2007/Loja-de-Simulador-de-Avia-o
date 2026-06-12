import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.observer.EstoqueSubject;
import stubs.ObserverStub;

/**
 * TC08 – Padrão Observer
 * Verifica que múltiplos observers são todos notificados.
 */
public class TC08_MultiploObserversTest {

    @Test
    @DisplayName("TC08 – Múltiplos observers recebem a mesma notificação")
    void tc08_multiplosObserversNotificados() {
        EstoqueSubject subject = new EstoqueSubject();
        ObserverStub stub1 = new ObserverStub();
        ObserverStub stub2 = new ObserverStub();
        subject.adicionarObservador(stub1);
        subject.adicionarObservador(stub2);

        subject.alterarNivel(3);

        assertEquals(1, stub1.mensagensRecebidas.size());
        assertEquals(1, stub2.mensagensRecebidas.size());
    }
}
