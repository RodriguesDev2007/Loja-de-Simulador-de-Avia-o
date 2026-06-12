
package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EstoqueSubject {

    private List<IObserver> observers = new ArrayList<>();

    public void adicionarObservador(IObserver observer){
        observers.add(observer);
    }

    public void alterarNivel(int nivel){
        for(IObserver o : observers){
            o.atualizar("Estoque crítico: " + nivel);
        }
    }
}
