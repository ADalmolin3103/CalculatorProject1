/*TODO:
 * 
 */

package Classes;

import Interfaces.CLInterface;

public class ChainedList<T> implements CLInterface<T> {

    // Atributos de classe e construtor
    private Node<T> first, last;
    private int size = 0;

    // Getters && Setters
    @Override
    public Node<T> getFirst() { // OK
        return this.first;
    }

    public void setFirst(Node<T> first) { // OK
        this.first = first;
    }

    public Node<T> getLast() { // OK
        return last;
    }

    public void setLast(Node<T> lastNode) { // OK
        this.last = lastNode;
    }

    public int getSize() { // OK
        return size;
    }

    public void setSize(int size) { // OK. Useless
        this.size = size;
    }

    // Interface methods
    @Override
    public void insertNext(T data) { // OK
        Node<T> n = new Node<>(data);
        if (isEmpty()) {
            this.setFirst(n);
            this.setLast(n);
            size++;
        } else {
            this.getLast().setNext(n);
            this.setLast(n);

            size++;
        }
    }

    @Override
    public void insertNext(T data, int place) { // OK. OBS se der isertNext(3) vai inserir depois do 3, ou seja, na
                                                // posição 4
        Node<T> N = new Node<T>(data);
        if (place <= this.getSize()) {
            if (place == 0) {
                N.setNext(first);
                this.setFirst(N);
                size++;
            } else if (place == size) {
                this.setLast(N);
                size++;
            } else {
                N.setNext(this.selectNode(place + 1));
                selectNode(place).setNext(N);
                size++;
            }
        } else
            throw new RuntimeException();

    }

    @Override
    public T getData(int place) { // OK
        if (place <= this.getSize() - 1) {
            return this.selectNode(place).getInfo();
        } else
            return null;

    }

    @Override
    public int getPlace(T data) { // OK
        Node<T> N;
        if (this.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        } else {
            N = this.getFirst();
        }
        for (int i = 0; i < this.getSize(); i++) {
            if (N.getInfo().equals(data)) {
                return i;
            } else {
                N = N.getNext();
            }
        }

        // Se chegar aqui significa que: 1) A lista não está vazia e o valor não foi
        // achado. Return -1;
        return -1;
    }

    @Override
    public void clearList() { // OK
        this.setFirst(null);
        this.setLast(null);
    }

    @Override
    public String showEntries() { // OK (SEXY)
        String entries = "";
        Node<T> N;
        if (this.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        } else {
            N = this.getFirst();
        }
        for (int i = 0; i < this.getSize(); i++) {
            entries += "Node[" + i + "] = " + N.getInfo() + "\r\n";
            N = N.getNext();
        }
        return entries;
    }

    @Override
    public boolean isEmpty() { // OK
        if (this.first == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Node<T> selectNode(int nodeNumber) { // OK
        Node<T> n;

        if (this.isEmpty()) {
            throw new RuntimeException();
        } else {
            n = this.getFirst();
        }

        if (nodeNumber > this.getSize() || nodeNumber < 0) {
            throw new RuntimeException("O número a ser buscado não é válido");
        } else {
            for (int i = 0; i < nodeNumber; i++) {
                n = n.getNext(); // Será executado nodeNumber -1 vezes;
            }
            return n;
        }
    }

    @Override
    public void removeNodePosition(int position) {// OK
        Node<T> nRemoving, nPrevious;
        if (this.isEmpty()) {
            throw new RuntimeException("List is empty");
        } else {
            if (position == 0) {
                nRemoving = this.getFirst().getNext();
                this.setFirst(nRemoving);
                size--;
            } else if (position == this.getSize()) {
                nRemoving = selectNode(position - 1);
                this.setLast(nRemoving);
                nRemoving.setNext(null);
                size--;
            } else {
                // nPrevious
                nPrevious = this.selectNode(position - 1);
                nRemoving = nPrevious.getNext(); // N vou iterar 2x do 0 T-T
                nPrevious.setNext(nRemoving.getNext()); // Nada aponta para nRemoving...
                nRemoving.setNext(null); // ... e ele n aponta para lugar nenhum
                size--;
            }
        }

    }

    @Override
    public void removeNodeValue(T value) {// OK
        if (this.isEmpty()) {
            throw new RuntimeException("Chained list is empty");
        } else {
            removeNodePosition(getPlace(value)); //Tira o nodo na posição retornada com o value
        }
    }
}
