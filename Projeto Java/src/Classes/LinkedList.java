/*TODO coisas para fazer para completar a classe (EM ORDEM-ish)
 * Testar o seletor de Nodo para implementação.
 * Fazer o construtor
 * Finalizar métodos de interface
 * 
 * OBS: pqp esqueci de definir que os atributos são privados. To codando @1:17am. Da um desconto ;w;
 */

package Classes;

import Interfaces.LLInterface;

public class LinkedList<T> implements LLInterface<T> {

    // Atributos de classe e construtor
    private Node<T> first, last;
    private int size = 0;

    public LinkedList() {
        //Do electric boogaloo muahahah
    }

    // Getters && Setters
    @Override
    public Node<T> getFirst() {
        return this.first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> lastNode) { // Para criar um Nodo e inserir como último: setLast(new Node<T>(T info)) =)
        this.last = lastNode;
    }

    // Interface methods
    @Override
    public void insertNext(T data) {
        Node<T> n = new Node<>(data);
        if (isEmpty()) {
            this.setFirst(n);
            size++;
        } else {
            this.last.setNext(n);
            this.setLast(n);
            size++;
        }
    }

    @Override
    public void insertNext(T data, int place) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertNext'");
    }

    @Override
    public T getData(int place) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getData'");
    }

    @Override
    public int getPlace(T data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlace'");
    }

    @Override
    public void clearList() {
        this.setFirst(null);
        this.setLast(null);
    }

    @Override
    public String showEntries() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showEntries'");
    }

    @Override
    public boolean isEmpty() {
        if (this.first == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Node<T> selectNode(int nodeNumber) {
        Node<T> n = first;
        // Não precisa de um if para ver se o nodeNumber é o primeiro, pois se for, ele
        // nem itera e avança. Só pula por cima ;)
        for (int i = 0; i < nodeNumber; i++) {
            n = n.getNext();
        }
        return n;
    }

}
