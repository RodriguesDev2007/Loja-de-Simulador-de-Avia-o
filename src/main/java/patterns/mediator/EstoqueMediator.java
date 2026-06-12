
package patterns.mediator;

public class EstoqueMediator implements IMediator {

    @Override
    public void registrarEntrada(String produto, int qtd){
        System.out.println("Entrada: " + produto + " " + qtd);
    }

    @Override
    public void registrarSaida(String produto, int qtd){
        System.out.println("Saída: " + produto + " " + qtd);
    }
}
