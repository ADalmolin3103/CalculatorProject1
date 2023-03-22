GUI com: 
    Input box, "=", "C", e 2 radio buttons em grupo (Para cada arquitetura de pilha)

Após clicar em =, usar um substring de " " para criar um vetor somente com numeros e operadores
For each para itrar cada elemento
    2 Ifs principais:
        1. Verifica se é numero
        2. verifica se é símbolo
            outro if para verificar qual símbolo (precisa estar em laço para iterar)
            
        Para verificar se é um número, criamos um método boleano que usa um ParseDouble para verificar qual tipo a string não pode ser, se o parse Double lançar uma excessão, não é um número. Usamos isto em um catch com return false. Se não, return true;
