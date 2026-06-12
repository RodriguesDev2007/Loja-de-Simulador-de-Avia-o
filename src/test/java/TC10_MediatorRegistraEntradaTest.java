import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import stubs.MediatorStub;

/**
 * TC10 – Padrão Mediator
 * Verifica que a entrada de produto é registrada corretamente via stub.
 */
public class TC10_MediatorRegistraEntradaTest {

    @Test
    @DisplayName("TC10 – Mediator registra entrada corretamente")
    void tc10_mediatorRegistraEntrada() {
        MediatorStub stub = new MediatorStub();
        stub.registrarEntrada("Joystick Airbus", 5);

        assertEquals(1, stub.entradas.size());
        assertTrue(stub.entradas.get(0).contains("Joystick Airbus"));
    }
}
