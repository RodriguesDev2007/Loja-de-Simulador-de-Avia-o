
package patterns.visitor;

public class RelatorioVisitor implements Visitor {

    @Override
    public void visitar(String nome){
        System.out.println("Relatório do produto: " + nome);
        System.out.println("Relatório concluído.");
    }
}
