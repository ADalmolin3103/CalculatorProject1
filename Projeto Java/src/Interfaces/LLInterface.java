package Interfaces;
public interface LLInterface<T> {
    public void insertNext(T data);
    public void insertNext(T data, int place);
    public T getData(int place);
    public int getPlace(T data);
    public void clearList();
    public T getFirst();
    public String showEntries();    
    public boolean isEmpty();
}
