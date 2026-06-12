
package patterns.proxy;

public interface IEstoqueService {

    void consultarEstoque();

    default void exibirCabecalho(){
        System.out.println("Consulta de estoque");
    }
}
