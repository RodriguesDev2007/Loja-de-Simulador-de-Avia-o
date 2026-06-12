
package patterns.visitor;

public interface Visitor {

    void visitar(String nome);

    default void iniciar(){
        System.out.println("Iniciando relatório");
    }
}
