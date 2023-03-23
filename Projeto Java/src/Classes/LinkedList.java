package Classes;

import Interfaces.LLInterface;

public class LinkedList<T> implements LLInterface<T> {

    // Construtor && atributos de classe
    public LinkedList() {

    }

    T primeiro, ultimo;

    // Getters && Setters
    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public T getUltimo() {
        return ultimo;
    }

    public void setUltimo(T ultimo) {
        this.ultimo = ultimo;
    }

    // Interface methods
    @Override
    public void insertNext(T data) {
        if(isEmpty()){
            
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearList'");
    }

    @Override
    public T getFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFirst'");
    }

    @Override
    public String showEntries() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showEntries'");
    }

    @Override
    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

}
