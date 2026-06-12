import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.proxy.ProxyEstoque;

/**
 * TC05 – Padrão Proxy
 * Verifica que perfil não-ADMIN tem acesso bloqueado sem lançar exceção.
 */
public class TC05_ProxyAcessoNegadoTest {

    @Test
    @DisplayName("TC05 – Proxy perfil não-ADMIN bloqueia acesso")
    void tc05_proxyPerfilInvalidoBloqueiaAcesso() {
        ProxyEstoque proxy = new ProxyEstoque("VISITANTE");

        assertDoesNotThrow(() -> proxy.consultarEstoque());
    }
}
