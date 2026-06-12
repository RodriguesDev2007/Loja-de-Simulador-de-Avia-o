
package patterns.proxy;

public class ProxyEstoque implements IEstoqueService {

    private String perfil;
    private EstoqueServiceReal real;

    public ProxyEstoque(String perfil){
        this.perfil = perfil;
        this.real = new EstoqueServiceReal();
    }

    @Override
    public void consultarEstoque(){
        if("ADMIN".equals(perfil)){
            real.consultarEstoque();
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
