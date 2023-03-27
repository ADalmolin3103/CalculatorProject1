package Classes;

public class Calculate {
    private String expression = "";
    private String[] expressionAr;
    private Stack stack;
     private OperationalMethods om = new OperationalMethods();

    public Calculate(String expression, boolean staticImplementation) {
        
        this.prepareInput(expression);
        int size = expressionAr.length;
        if (staticImplementation) {
            stack = new StaticStack(size);
        } else {
            stack = new DynamicStack(size);
        }
    }

    public void prepareInput(String expression) {
        // O que acontece aqui embaixo: a gente define o atributo expression(string) com
        // a string passada pelo construtor. Separamos ela em substring de " ",
        // filtramos caracteres irregulares com REGEX, tiramos eles, e fica uma String[]
        // limpa
        this.setExpression(expression);
        expressionAr = om.separateValues(expression);
        om.filterInput(expressionAr);
    }

    public double resolve() {
        double numA = 0.0, numB = 0.0, ans = 0.0;
        try {
            String operator = "";
            for (int i = 0; i < expressionAr.length; i++) {
                if (expressionAr[i].matches("[- | + | * | /]")) { // Se tiver operador, pop e veja qual operador é
                    operator = expressionAr[i];
                    numB = stack.pop();
                    numA = stack.pop();

                    switch (operator) {
                        case "+":
                            ans = numA + numB;
                            break;

                        case "-":
                            ans = numA - numB;
                            break;

                        case "*":
                            ans = numA*numB;
                        break;

                        case "/":
                        ans  = numA/numB;
                            break;
                    }
                    stack.push(ans);
                } else if (om.isNumber(expressionAr[i])) {
                    stack.push(Double.parseDouble(expressionAr[i]));
                } 
            }
            if(stack.getSize() != 1){
                throw new RuntimeException("\u001b[1;31m Expressão invalida \u001b[0m ");
            }
            return ans;
        } catch (Exception e) {
            System.out.println("\u001b[1;31m Algo deu errado \u001b[0m : " + e);
        }
        return ans; //Teoricamente unreachable
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public String[] getExpressionAr() {
        return expressionAr;
    }

    public void setExpressionAr(String[] expressionAr) {
        this.expressionAr = expressionAr;
    }

    public OperationalMethods getOm() {
        return om;
    }

    public void setOm(OperationalMethods om) {
        this.om = om;
    }
}
