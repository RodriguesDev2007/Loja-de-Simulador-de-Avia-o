import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import stubs.MediatorStub;

/**
 * TC11 – Padrão Mediator
 * Verifica que a saída de produto é registrada corretamente via stub.
 */
public class TC11_MediatorRegistraSaidaTest {

    @Test
    @DisplayName("TC11 – Mediator registra saída corretamente")
    void tc11_mediatorRegistraSaida() {
        MediatorStub stub = new MediatorStub();
        stub.registrarSaida("Pedal Cessna", 2);

        assertEquals(1, stub.saidas.size());
        assertTrue(stub.saidas.get(0).contains("Pedal Cessna"));
    }
}
