package Interfaces;
public interface StaticStackInterface<T>  {
    
    public void push(double data);
    public double pop();
    public double peek();
    public boolean isEmpty();
    public void reset();
}
