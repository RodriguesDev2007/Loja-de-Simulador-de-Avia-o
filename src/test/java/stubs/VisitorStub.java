package stubs;

import patterns.visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Stub de Visitor.
 * Captura os nomes visitados para verificação nos testes.
 */
public class VisitorStub implements Visitor {

    public List<String> nomesVisitados = new ArrayList<>();

    @Override
    public void visitar(String nome) {
        nomesVisitados.add(nome);
    }
}
