/*TODO:
 * Testar remoção de nodos..
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Interface methods
    @Override
    public void insertNext(T data) {
        Node<T> n = new Node<>(data);
        if (isEmpty()) {
            this.setFirst(n);
            this.setLast(n);
            size++;
        } else {
            this.last.setNext(n);
            this.setLast(n);
            size++;
        }
    }

    @Override
    public void insertNext(T data, int place) {
        Node<T> N = new Node<T>(data);
        if (place <= this.getSize()) {
            if (place == 0) {
                N.setNext(first);
                this.first = N;
                size++;
            } else if (place == size) {
                this.last = N;
                this.setLast(N);
                size++;
            } else {
                selectNode(place).setNext(N);
                size++;
            }
        }

        else
            throw new RuntimeException();

    }

    @Override
    public T getData(int place) {
        if (place <= this.getSize() - 1) {
            return this.selectNode(place).getInfo();
        } else
            return null;

    }

    @Override
    public int getPlace(T data) {
        Node<T> N;
        if (this.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        } else {
            N = this.getFirst();
        }

        for (int i = 0; i < this.getSize(); i++) {
            if (N.getInfo() == data)
                return i;
            else
                N = N.getNext();
        }

        // Se chegar aqui significa que: 1) A lista não está vazia e o valor não foi
        // achado. Return -1;
        return -1;
    }

    @Override
    public void clearList() {
        this.setFirst(null);
        this.setLast(null);
    }

    @Override
    public String showEntries() { // Necessário para dar a resposta ou o que está faltando? Talvez precise mudar
                                  // para tirar a notação de Node[i]=info
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

    @Override
    public void removeNodePosition(int position) {
        Node<T> n;
        n = selectNode(position - 1); // Remove o próximo nodo no penúltimo, fazendo ele ser o último
        n.setNext(null);
        this.setLast(n); //Define o último como o último antes da posição fornecida
    }

    @Override
    public void removeNodeValue(T value) {
        Node<T> n;
        if(this.isEmpty()){
            throw new RuntimeException("Chained list is empty");
        } else n = this.getFirst();
        for(int i = 0; i < this.getSize(); i++){
            if(n.getInfo() == value){
                this.removeNodePosition(i);
            } else n = n.getNext();
        }
    }

}
