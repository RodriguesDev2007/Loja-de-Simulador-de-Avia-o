import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.factory.ProdutoFactory;
import patterns.factory.ProdutoAviacao;
import stubs.VisitorStub;

/**
 * TC15 – Padrão Visitor
 * Verifica que o visitor percorre múltiplos produtos corretamente,
 * mantendo a ordem e sem erro.
 */
public class TC15_VisitorMultiplosProdutosTest {

    @Test
    @DisplayName("TC15 – Visitor visita múltiplos produtos sem erro")
    void tc15_visitorMultiplosProdutos() {
        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao p1 = factory.criarJoystick("Joystick A", 1);
        ProdutoAviacao p2 = factory.criarPedal("Pedal B", 1);
        VisitorStub stub = new VisitorStub();

        p1.aceitar(stub);
        p2.aceitar(stub);

        assertEquals(2, stub.nomesVisitados.size());
        assertEquals("Joystick A", stub.nomesVisitados.get(0));
        assertEquals("Pedal B",    stub.nomesVisitados.get(1));
    }
}
