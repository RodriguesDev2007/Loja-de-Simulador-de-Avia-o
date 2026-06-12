
import patterns.factory.*;
import patterns.proxy.*;
import patterns.observer.*;
import patterns.mediator.*;
import patterns.visitor.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== AEROSTOCK =====");

        ProdutoFactory factory = new ProdutoFactory();
        ProdutoAviacao produto = factory.criarJoystick("Joystick Airbus", 10);

        ProxyEstoque proxy = new ProxyEstoque("ADMIN");
        proxy.consultarEstoque();

        EstoqueSubject estoque = new EstoqueSubject();
        estoque.adicionarObservador(new NotificadorEstoque("Administrador"));
        estoque.alterarNivel(2);

        EstoqueMediator mediator = new EstoqueMediator();
        mediator.registrarEntrada(produto.getNome(), 5);
        mediator.registrarSaida(produto.getNome(), 1);

        RelatorioVisitor visitor = new RelatorioVisitor();
        produto.aceitar(visitor);

        System.out.println("Fim da execução.");
    }
}
