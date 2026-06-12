import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.factory.ProdutoFactory;
import patterns.factory.ProdutoAviacao;
import patterns.factory.PecaSimulador;

/**
 * TC03 – Padrão Factory Method
 * Verifica se o produto retornado é uma instância de PecaSimulador.
 */
public class TC03_FactoryInstanciaPecaTest {

    @Test
    @DisplayName("TC03 – Produto criado é instância de PecaSimulador")
    void tc03_produtoCriadoEhPecaSimulador() {
        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao produto = factory.criarJoystick("Joystick X", 1);

        assertInstanceOf(PecaSimulador.class, produto);
    }
}
