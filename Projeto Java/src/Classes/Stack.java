package Classes;

import Interfaces.Pilha;

public abstract class Stack implements Pilha{
    //Esta classe é só para que as classes que a extendem sejam compatíveis. Nao existe método abstrato para passar por herança pois todos os métodos foram passados pela interface 
    public abstract int getSize();
}
