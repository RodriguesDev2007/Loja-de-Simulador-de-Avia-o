package stubs;

import patterns.proxy.IEstoqueService;

/**
 * Stub de IEstoqueService.
 * Registra se consultarEstoque() foi chamado, sem acessar dados reais.
 */
public class EstoqueServiceStub implements IEstoqueService {

    public boolean consultado = false;

    @Override
    public void consultarEstoque() {
        consultado = true;
    }
}
