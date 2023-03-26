package Classes;

import Interfaces.*;

//TODO testar as coisas

public class StaticStack implements StaticStackInterface<Double> {

    // Atributo
    double[] info;
    int size, limit;

    // Construtor
    public StaticStack(int limit) {
        this.setLimit(limit);
        this.info = new double[this.getLimit()];
    }

    // Getters && Setters
    public double[] getInfo() {
        return info;
    }

    public void setInfo(double[] info) {
        this.info = info;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void push(double data) {
        if (this.size == this.limit) {
            throw new RuntimeException("Stack overflow UwU");
        } else {
            info[size] = data;
            size++;
        }
    }

    @Override
    public double pop() {
        if (size == 0) {
            throw new RuntimeException("Stack underflow");
        } else {
            double data;
            data = this.info[this.size-1];
            size--;
            return data;
        }
    }

    @Override
    public double peek() {
        if (size == 0) {
            throw new RuntimeException("Stack underflow");
        } else {
            return info[size-1];
        }
    }

    @Override
    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        } else return false;
    }

    @Override
    public void reset() {
        this.setSize(0);
    }
}