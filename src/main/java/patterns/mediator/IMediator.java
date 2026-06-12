
package patterns.mediator;

public interface IMediator {

    void registrarEntrada(String produto, int qtd);

    void registrarSaida(String produto, int qtd);
}
