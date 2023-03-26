
//Ideia: será que dá pra gerar uma classe de cálculo que é genérica para o tipo de stack? A final elas usam os mesmos métodos.
//Vou tirar uma interface e deixar uam interface padrão "StackInterface<T>" onde para T  é passado uma classe de array ou linked list? The fuck?
//Pensar bastante, e tomar café. 
//Talvez por ter a mesma interface, eu consiga criar uma super classe cuja ambas as stacks extendem, na implementação posso fazer:
//Stack = new DynamicStack(); ou Stack = new StaticStack(); sem perda de nada. Mas aí preciso ver o que ambas teriam na super classe
//Fazer uml e se conseguir, tenho direiro a um monster uhul
import Classes.OperationalMethods;

public class Test {
    public static void main(String[] args) {
        // Teste de stacks ambas funfam
        
        OperationalMethods om = new OperationalMethods();
        String validade = "1 2 +";
        System.out.println(om.isValidForExpression(validade));
    }
}
