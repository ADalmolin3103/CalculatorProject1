package Classes;

import Interfaces.*;

public class OperationalMethods implements OperationalMethodsInterface {

    @Override
    public String[] separateValues(String expression) {
        return expression.split(" ");

    }

    @Override
    public boolean isNumber(String snippet) {
        try {
            Double.parseDouble(snippet);
            return true;
        } catch (NullPointerException npe) {
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }   catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean isValidForExpression(String snippet) {

        // REGEX herói da partida o/
        if (snippet.isEmpty()) {
            return false;
        } else if(snippet.matches("[- | + | / | * | 0-9 | \\.]*")) {
            return true;
        } else {
            return false;
        }
    }

    public String[] removePosition(String[] stringInput, int pos){
        String[] reducedArray;
        if(stringInput.length == 0){
            throw new RuntimeException("Array vazio");
        } else {
            for(int i = pos; i < stringInput.length-1; i++){
                stringInput[i] = stringInput[i+1];
            }
            reducedArray = new String[stringInput.length-1];
            for(int i = 0; i < stringInput.length -1; i++){
                reducedArray[i]=stringInput[i];
            }
            return reducedArray;
        }
    }
    
    @Override
    public String filterInput(String[] stringInput) { //This implemented with removePosition is just genius work. Congrats for me i guess
        String out= "";
        for (int i = 0; i < stringInput.length; i++) {
            String s = stringInput[i];
            if (!isValidForExpression(s)) {
                stringInput = removePosition(stringInput, i);
            }
        }
        for(String s: stringInput){
            out += s + " ";
        }
        return out;
    }

}
