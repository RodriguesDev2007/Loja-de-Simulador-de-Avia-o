import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.proxy.ProxyEstoque;

/**
 * TC04 – Padrão Proxy
 * Verifica que o perfil ADMIN consegue consultar o estoque sem exceção.
 */
public class TC04_ProxyAdminPermiteAcessoTest {

    @Test
    @DisplayName("TC04 – Proxy ADMIN permite acesso ao estoque")
    void tc04_proxyAdminPermiteAcesso() {
        ProxyEstoque proxy = new ProxyEstoque("ADMIN");

        assertDoesNotThrow(() -> proxy.consultarEstoque());
    }
}
