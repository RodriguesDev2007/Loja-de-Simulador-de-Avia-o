import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import patterns.factory.ProdutoFactory;
import patterns.factory.ProdutoAviacao;
import patterns.visitor.RelatorioVisitor;

/**
 * TC14 – Padrão Visitor
 * Verifica que o RelatorioVisitor real não lança exceção ao visitar um produto.
 */
public class TC14_RelatorioVisitorSemExcecaoTest {

    @Test
    @DisplayName("TC14 – RelatorioVisitor não lança exceção ao visitar produto")
    void tc14_relatorioVisitorNaoLancaExcecao() {
        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao produto = factory.criarPedal("Pedal Ultra", 1);
        RelatorioVisitor visitor = new RelatorioVisitor();

        assertDoesNotThrow(() -> produto.aceitar(visitor));
    }
}
