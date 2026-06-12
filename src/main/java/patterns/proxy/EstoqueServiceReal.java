
package patterns.proxy;

public class EstoqueServiceReal implements IEstoqueService {

    @Override
    public void consultarEstoque() {
        System.out.println("Executando consulta real...");
        System.out.println("Produto A");
        System.out.println("Produto B");
    }
}
