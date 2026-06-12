package stubs;

import patterns.mediator.IMediator;
import java.util.ArrayList;
import java.util.List;

/**
 * Stub de IMediator.
 * Captura entradas e saídas registradas para verificação nos testes.
 */
public class MediatorStub implements IMediator {

    public List<String> entradas = new ArrayList<>();
    public List<String> saidas   = new ArrayList<>();

    @Override
    public void registrarEntrada(String produto, int qtd) {
        entradas.add(produto + ":" + qtd);
    }

    @Override
    public void registrarSaida(String produto, int qtd) {
        saidas.add(produto + ":" + qtd);
    }
}
