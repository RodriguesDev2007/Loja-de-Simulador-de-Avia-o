
package patterns.visitor;

public interface IElemento {

    void aceitar(Visitor visitor);

    default void registrar(){
        System.out.println("Elemento registrado");
    }
}
