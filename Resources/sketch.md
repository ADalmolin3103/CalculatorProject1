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

Exemplo de execução:

IN: 1.0 2.0 + 3 *;

1) separa-se os números e símbolos e coloca em uma lista dinâmica ou estática (Usuário vai escolher)
2) Itera a lista, usa o método de identificação de numeros. Se for número, insere, se não, calcula:
    2.1)Pilha (sempre double): push 1.0
    2.2) Pilha: push 2.0
    2.3) detecta + e para:
    2.4) 2x pop da pilha principal para outra pilha* 
    

* Se utilizarmos a ordem de pop, contariamos ao contrario, pois no caso de entrada de 3 2 -, espera-se que seja computado 3-2 = 1. Se Fizermos por ordem de pop, o 2 sofreu push por ultimo, então na hora de pop seria computado 2 - 3 = -1. O que não é esperado
    

