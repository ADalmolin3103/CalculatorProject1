package Interfaces;

public interface OperationalMethodsInterface {
    public String[] separateValues(String expression);
    public boolean isNumber(String snippet);
    public boolean isValidForExpression(String snippet);
    public String filterInput(String[] stringInput);
   public String[] removePosition(String[] stringInput, int pos);
}
