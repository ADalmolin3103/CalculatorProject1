package Interfaces;

import Classes.Node; //Permite a criação de um método de retorno de um Nodo genérico

public interface CLInterface<T> {
    public void insertNext(T data);

    public void insertNext(T data, int place);

    public T getData(int place);

    public int getPlace(T data);

    public void clearList();

    public Node<T> getFirst();

    public String showEntries();

    public boolean isEmpty();

    public Node<T> selectNode(int nodeNumber);

    public void removeNodePosition(int position);

    public void removeNodeValue(T value);

}
