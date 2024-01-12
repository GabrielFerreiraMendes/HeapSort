## Algoritmo de ordenação Heap Sort
Algoritmo desenvolvido, originalmente em C++, para projeto academico da disciplina estrutura de dados.

## Funcionamento do Heap Sort
O HeapSort utiliza uma estrutura de dados chamada Heap para ordenar os elementos a medida que os insere na estrutura. Assim, ao final das inserções, os elementos podem ser sucessivamente removidos da raiz da heap, na ordem desejada, sendo essencial que a propriedade max-heap seja mantida. Essa propriedade garante que o valor de todos os nós são menores que os de seus respectivos pais.

![image](https://github.com/GabrielFerreiraMendes/HeapSort/assets/14356303/cc12717e-4779-4f25-860e-4b1a1fb2f472)

## Observação
O HeapSort é um dos algoritmos com melhor desempenho e é bastante utilizado em sistemas operacionais no gerenciamento de memória e na promoção de filas de prioridade, pois possui desempenho em tempo de execução satisfatório em sequências aleatoriamente desordenadas, utiliza pouca memória e o seu desempenho em pior cenário é praticamente igual ao desempenho em cenário médio, isso porque possui complexidade O(n lg n). Com isso, torna-se uma ótima possibilidade de utilização, visto que muitos dos algoritmos de ordenação possuem desempenho insatisfatório no pior cenário, quer em tempo de execução, quer no uso de memória, como por exemplo, os algoritmos Bubble Sort e Selection Sort que possuem ordem de complexidade O(n²).
