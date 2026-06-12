import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.factory.ProdutoFactory;
import patterns.factory.ProdutoAviacao;
import stubs.VisitorStub;

/**
 * TC13 – Padrão Visitor
 * Verifica que o visitor recebe o nome correto do produto ao visitar.
 */
public class TC13_VisitorRecebeNomeProdutoTest {

    @Test
    @DisplayName("TC13 – Visitor recebe o nome do produto ao visitar")
    void tc13_visitorRecebeNomeProduto() {
        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao produto = factory.criarJoystick("Joystick Pro", 2);
        VisitorStub stub = new VisitorStub();

        produto.aceitar(stub);

        assertEquals(1, stub.nomesVisitados.size());
        assertEquals("Joystick Pro", stub.nomesVisitados.get(0));
    }
}
