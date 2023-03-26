//TODO: Implantar tudo para cálculo em stack, nas 2. Depois, colocar na GUI.
//Ideia: será que dá pra gerar uma classe de cálculo que é genérica para o tipo de stack? A final elas usam os mesmos métodos.
//Vou tirar uma interface e deixar uam interface padrão "StackInterface<T>" onde para T  é passado uma classe de array ou linked list? The fuck?
//Pensar bastante, e tomar café. 
//Talvez por ter a mesma interface, eu consiga criar uma super classe cuja ambas as stacks extendem, na implementação posso fazer:
//Stack = new DynamicStack(); ou Stack = new StaticStack(); sem perda de nada. Mas aí preciso ver o que ambas teriam na super classe
//Fazer uml e se conseguir, tenho direiro a um monster uhul
import Classes.OperationalMethods;

public class Test {
    public static void main(String[] args) {
        //
        String testSub = "1 a 2 b + 10 *";
        OperationalMethods om = new OperationalMethods();
        String[] separatedVals = om.separateValues(testSub);

        System.out.println(om.isValidForExpression(testSub));
        System.out.println(om.isValidForExpression(om.filterInput(separatedVals)));
        
        testSub = om.filterInput(om.separateValues(testSub));
        System.out.println(testSub);
        //om.filterInput(separatedVals); 
        
    }
}
