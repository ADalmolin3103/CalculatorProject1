//Atenção: Tamanho != limite
package Classes;

import Interfaces.*;

public class DynamicStack implements DynamicStackInterface {

    // Attributes && Constructor
    private ChainedList<Double> dataList;
    private int size = 0, limit;

    public DynamicStack(int limit) { // Ok
        this.setLimit(limit);
        dataList = new ChainedList<>();
    }

    public ChainedList<Double> getDataList() {
        return dataList;
    }

    public void setDataList(ChainedList<Double> dataList) {
        this.dataList = dataList;
    }

    public int getSize() { // OK
        return this.size;
    }

    public void setSize(int s) { // OK
        this.size = s;
    }

    public int getLimit() { // OK
        return this.limit;
    }

    public void setLimit(int limit) { // OK
        this.limit = limit;
    }

    @Override
    public void push(double info) { // OK
        if (this.getSize() == this.getLimit()) {
            throw new RuntimeException("Stack overflow");
        } else {
            dataList.insertNext(info);
            size++;
        }
    }

    @Override
    public double pop() { // ok //A idéia é pegar a info de n e desvincular o ultimo (tirando a ponte do // penúltimo pra ele, e alterando o atribto que aponta para ele)
        Node<Double> n = null;
        double info;
        n = dataList.getLast();
        info = n.getInfo();
        dataList.removeNodePosition(dataList.getSize() - 1); // O tamanho aponta para o último
        size--;
        return info;
    }

    @Override
    public double peek() {
        if (this.getDataList().isEmpty()) {
            throw new RuntimeException("A lista esta vazia");
        } else {
            return this.dataList.getLast().getInfo();
        }
    }

    @Override
    public boolean isEmpty() {
        if(this.getSize() == 0){
            return true;
        } else return false;
    }

    @Override
    public void reset() {
        this.setSize(0);
        dataList.clearList();
    }
}
