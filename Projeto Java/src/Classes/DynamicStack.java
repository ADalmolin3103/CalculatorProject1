package Classes;
import Interfaces.*;
public class DynamicStack implements DynamicStackInterface {

    //Attributes && Constructor
    private ChainedList<Double> dataList ;
    
    public DynamicStack(){
        dataList = new ChainedList<>();
    }

    @Override
    public void push(double info) {
        dataList.insertNext(info);
    }

    @Override
    public double pop() {
        Node<Double> n;
        double info;
        n = dataList.getLast();
        info = n.getInfo();
        dataList.

    }

    @Override
    public double peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

    
}
