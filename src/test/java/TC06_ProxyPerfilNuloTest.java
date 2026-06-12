import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.proxy.ProxyEstoque;

/**
 * TC06 – Padrão Proxy
 * Verifica que perfil null não causa NullPointerException.
 * Cenário de exceção/borda.
 */
public class TC06_ProxyPerfilNuloTest {

    @Test
    @DisplayName("TC06 – Proxy com perfil nulo não lança NullPointerException")
    void tc06_proxyPerfilNuloNaoLancaExcecao() {
        ProxyEstoque proxy = new ProxyEstoque(null);

        assertDoesNotThrow(() -> proxy.consultarEstoque());
    }
}
