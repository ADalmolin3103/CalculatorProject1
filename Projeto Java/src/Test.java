import Classes.*;

public class Test {
    public static void main(String[] args) {
        ChainedList<Integer> L1 = new ChainedList<>();
        L1.insertNext(1);
        L1.insertNext(2);
        L1.insertNext(2);
        L1.insertNext(2);
        L1.insertNext(3);
        L1.insertNext(2);

        Node<Integer> node = L1.selectNode(4);
        System.out.println(node.getInfo());
        L1.insertNext(4, 0);
        System.out.println(L1.getFirst().getInfo());
        L1.insertNext(5, L1.getSize()); //Inserir no ultimo
        System.out.println(L1.getLast().getInfo());
        
    }
}
