package Classes;

public class StaticStack extends Stack{

    // Atributo
    private double[] info;
    private int size, limit;

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
            throw new RuntimeException("\u001b[1;31m  Stack overflow UwU \u001b[0m");
        } else {
            info[size] = data;
            size++;
        }
    }

    @Override
    public double pop() {
        if (size == 0) {
            throw new RuntimeException("\u001b[1;31m  Stack underflow UwU \u001b[0m");
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
            throw new RuntimeException("\u001b[1;31m  Stack underflow UwU \u001b[0m");
        } else {
            return info[size-1];
        }
    }

    @Override
    public boolean estaVazia() {
        if(this.size == 0){
            return true;
        } else return false;
    }

    @Override
    public void liberar() {
        this.setSize(0);
    }
}