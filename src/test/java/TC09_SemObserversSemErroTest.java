import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.observer.EstoqueSubject;

/**
 * TC09 – Padrão Observer
 * Verifica que notificar sem observers registrados não gera erro.
 * Cenário alternativo.
 */
public class TC09_SemObserversSemErroTest {

    @Test
    @DisplayName("TC09 – Nenhuma notificação quando não há observers registrados")
    void tc09_semObserversNenhumaNotificacao() {
        EstoqueSubject subject = new EstoqueSubject();

        assertDoesNotThrow(() -> subject.alterarNivel(10));
    }
}
