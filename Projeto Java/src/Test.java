import java.io.Console;
import java.util.Scanner;

import Classes.*;
//TODO testar CL de remove la com o treco
public class Test {
    public static void main(String[] args) {


        /* ChainedList<Double> cl = new ChainedList<>(); */
        DynamicStack ds = new DynamicStack(10);
        ds.push(1.0);
        ds.push(2.0);
        ds.push(3.0);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        int x = 327, centena, dezena, unidade;
        centena = x/100;
        // 327 % 100 = 27 (tira centena)
        //  27 % 10 = 2 (tira dezena)
        
    }
}
