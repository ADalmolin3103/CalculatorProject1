/*TODO set stack overflows
 * 
 */
//Atenção: Tamanho != limite
package Classes;
import Interfaces.*;
public class DynamicStack implements DynamicStackInterface {

    //Attributes && Constructor
    private ChainedList<Double> dataList ;
    private int size = 0, limit;

    public DynamicStack(int limit){
        this.setLimit(limit);
        dataList = new ChainedList<>();
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int s){
        this.size = s;
    }

    public int getLimit(){
        return this.limit;
    }

    public void setLimit(int limit){
        this.limit = limit;
    }

    @Override
    public void push(double info) {
        if(this.getSize() == this.getLimit()){
            throw new RuntimeException("Stack overflow");
        } else {
            dataList.insertNext(info);
            size++;
        }
    }

    @Override
    public double pop() { //A idéia é pegar a info de n e desvincular o ultimo (tirando a ponte do penúltimo pra ele, e alterando o atribto que aponta para ele)
        Node<Double> n;
        double info;
        n = dataList.getLast();
        info = n.getInfo();
        dataList.removeNodePosition(dataList.getSize()); //O tamanho aponta para o último
        size--;
        return info;
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
