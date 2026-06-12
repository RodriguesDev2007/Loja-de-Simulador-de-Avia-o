import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.factory.ProdutoFactory;
import patterns.factory.ProdutoAviacao;

/**
 * TC02 – Padrão Factory Method
 * Verifica se o pedal é criado com o nome correto.
 */
public class TC02_FactoryCriaPedalTest {

    @Test
    @DisplayName("TC02 – Factory cria pedal com nome correto")
    void tc02_factoryCriaPedalComNomeCorreto() {
        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao produto = factory.criarPedal("Pedal Cessna", 3);

        assertEquals("Pedal Cessna", produto.getNome());
    }
}
