import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.mediator.EstoqueMediator;

/**
 * TC12 – Padrão Mediator
 * Verifica que o EstoqueMediator real executa sem lançar exceção.
 */
public class TC12_EstoqueMediatorRealTest {

    @Test
    @DisplayName("TC12 – EstoqueMediator real não lança exceção ao registrar")
    void tc12_estoqueMediatorRealFunciona() {
        EstoqueMediator mediator = new EstoqueMediator();

        assertDoesNotThrow(() -> mediator.registrarEntrada("Joystick", 3));
        assertDoesNotThrow(() -> mediator.registrarSaida("Joystick", 1));
    }
}
