GUI com: 
    Input box, "=", "C", e 2 radio buttons em grupo (Para cada arquitetura de pilha)

Métodos:
Um método que retorna um vetor de string com todos os caracteres inseridos
Um método para filtrar numeros e símbolos*
Um método que diferencia se é um número ou operando o caracter que esta na célula
Um método que processa o vetor e retorna outro limpo (sem caracteres ilegais)
Finalmente um método de soma
    Ele vai iterar sobre a pilha, e a cada caracter que for selecionado, passar o método que verifica numero ou operando.
        se: caracter == numero: avança o array
        se não, pop para ter 2 números para operar
            se não tem 2 numeros, excessão
        fim se
        ou sera q não (dun dun duuuun) 

        Segue este ciclo até ficar no final:
        1 número: resposta
        2 numeros sem operador : erro de digitação
        1 numero e 1 operador: erro de digitação
                    
        Para verificar se é um número, criamos um método boleano que usa um ParseDouble para verificar qual tipo a string não pode ser, se o parse Double lançar uma excessão, não é um número. Usamos isto em um catch com return false. Se não, return true;
