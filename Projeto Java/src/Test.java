import Classes.*;

/*TODO: Testar todas as funcionalidades da lisata encadeada */

public class Test {
    public static void main(String[] args) {
        /*
         * Testado:
         * OK! isEmpty
         * OK! InsertNext(sem pos)
         * OK! InsertNext(Com pos)
         * OK! Select Node
         * 
         */
        // Criação dos objetos
        ChainedList<Double> cl = new ChainedList<>(); // Chained list para teste;
        Node<Double> n;

        // Inserção de dados
        cl.insertNext(1.0);
        cl.insertNext(2.0);
        cl.insertNext(3.0);
        cl.insertNext(4.0);
        cl.insertNext(5.0);
        cl.insertNext(3.5, 3);

        System.out.println(cl.showEntries());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-= Removendo cl[0] -=-=-=-=-=-=-=-=-=-=-=-=");

        cl.removeNodePosition(0);
        System.out.println(cl.showEntries());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-= Removendo cl[3.5] -=-=-=-=-=-=-=-=-=-=-=-=");
        cl.removeNodeValue(3.5);
        System.out.println(cl.showEntries());

    }

    // Imprime valores da lista para teste
    public static void printCLVals(ChainedList<Double> cl) {
        Node<Double> n;
        if (cl.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        } else {
            n = cl.getFirst();
        }

        for (int i = 0; i < cl.getSize(); i++) {
            System.out.println(i + ", " + n.getInfo());
            n = n.getNext();
        }
    }
}
