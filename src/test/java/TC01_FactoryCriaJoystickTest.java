import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.factory.ProdutoFactory;
import patterns.factory.ProdutoAviacao;

/**
 * TC01 – Padrão Factory Method
 * Verifica se o joystick é criado com o nome correto.
 */
public class TC01_FactoryCriaJoystickTest {

    @Test
    @DisplayName("TC01 – Factory cria joystick com nome correto")
    void tc01_factoryCriaJoystickComNomeCorreto() {
        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao produto = factory.criarJoystick("Joystick Airbus", 5);

        assertEquals("Joystick Airbus", produto.getNome());
    }
}
