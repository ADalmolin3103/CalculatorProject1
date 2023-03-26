package Classes;

public abstract class Stack{
    //Esta classe é só para que as classes que a extendem sejam compatíveis. Nao existe método abstrato para passar por herança pois todos os métodos foram passados pela interface 
    public abstract void push(double info);
    public abstract double pop();
    public abstract double peek();
    public abstract boolean isEmpty();
    public abstract void reset();
    public abstract int getSize();
}
