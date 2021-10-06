# About this repo

This repo stores material used on the course Data Structures at UFPA

1) Contribuidores:

   André Vinicius Neves Alves
   Matrícula: 202007040035
   Usuário: ViniNeves6
   
   Flávio Rafael Trindade de Moura
   Matrícula: 202006840019
   Usuário: Horusprg

   Gabriel Xavier Vieira do Nascimento
   Matrícula: 202007040030
   Usuário: gabrielx213
    
   Hayla Luiza da Costa Almeida
   Matrícula: 202006840023
   Usuário: HaylaAlmeida

2) O problema baseia-se na busca pelo menor caminho entre todos os pares de vértice. O comprimento pode ser as arestas que conectam os vértices, caso ele seja não ponderado, ou a soma dos pesos que conectam esses vértices, caso seja ponderado.

- grafo ponderado e direcionado:

![imagem](https://user-images.githubusercontent.com/70808027/136249702-877698f6-64ff-4df1-9bff-757ef3d10486.jpeg)

montagem:

g = Grafo(5, True)

g.insere_Aresta(0, 1, 2, True)

g.insere_Aresta(1, 3, 1, True)

g.insere_Aresta(1, 2, 3, True)

g.insere_Aresta(2, 4, 4, True)

g.insere_Aresta(3, 0, 2, True)

g.insere_Aresta(3, 4, 3, True)

g.insere_Aresta(4, 1, 5, True)

saida:

![unknown](https://user-images.githubusercontent.com/70808027/136250695-4a8d7770-1f5a-4629-97f8-bb0123af12ba.png)

- Grafo não ponderado e não direcionado:

![image](https://user-images.githubusercontent.com/80348569/136139861-9094e5a4-f84f-4db7-aa01-76c784abaa1a.png)

Montagem:

g = Grafo(5, False)

g.insere_Aresta(0, 1, 1, False)

g.insere_Aresta(1, 3, 1, False)

g.insere_Aresta(1, 2, 1, False)

g.insere_Aresta(2, 4, 1, False)

g.insere_Aresta(3, 0, 1, False)

g.insere_Aresta(3, 4, 1, False)

g.insere_Aresta(4, 1, 1, False)

Saída:

![image](https://user-images.githubusercontent.com/80348569/136140108-a28bb9b5-5ccd-46a0-84f3-c2f6279c3b84.png)



- Grafo não ponderado e direcionado:

![image](https://user-images.githubusercontent.com/80348569/136139186-fc7a8ef4-2ff0-45fd-bc30-5f1e66b5630e.png)

Montagem:
g = Grafo(5, False)

g.insere_Aresta(0, 1, 1, True)

g.insere_Aresta(1, 3, 1, True)

g.insere_Aresta(1, 2, 1, True)

g.insere_Aresta(2, 4, 1, True)

g.insere_Aresta(3, 0, 1, True)

g.insere_Aresta(3, 4, 1, True)

g.insere_Aresta(4, 1, 1, True)

Saída:

![image](https://user-images.githubusercontent.com/80348569/136141735-22f0ee50-391b-4aa4-8431-7e487128cecd.png)


- pondederado e não direcionado:

![WhatsApp Image 2021-10-06 at 01 56 40](https://user-images.githubusercontent.com/70808027/136250806-2f88bc14-df0c-41d6-a15c-0e90f8301edb.jpeg)

montagem:

g = Grafo(5, True)

g.insere_Aresta(0, 1, 2, False)

g.insere_Aresta(1, 3, 1, False)

g.insere_Aresta(1, 2, 3, False)

g.insere_Aresta(2, 4, 4, False)

g.insere_Aresta(3, 0, 2, False)

g.insere_Aresta(3, 4, 3, False)

g.insere_Aresta(4, 1, 5, False)

saida:

![unknown](https://user-images.githubusercontent.com/70808027/136251095-c3f518d9-0ebd-4e30-94b4-03da53b04ec6.png)


3) O problema é facilmente aplicado na prática quando trazemos o conceito de acharmos o menor caminho entre dois lugares. Imagine que queremos poupar tempo indo de um lugar da cidade ao outro, no entanto, teríamos que primeiro visualiazar o mapa da cidade, para sabermos em que lugar estamos e quais ruas iríamos usar para chegar no menor tempo possível ao nosso objetivo. Mas, vale ressaltar que, nessas ruas, existem fluxo de tráfego (que pode ser ligado diretamente ao peso de um grafo) que também devem ser levados em consideração.

4)o algoritmo criado segue o mesmo conceito do algoritmo de Dijkstra, onde se é escolhido um vértice como raiz da busca, este algoritmo calcula o custo mínimo deste vértice para todos os demais vértices do grafo. O algoritmo pode ser usado sobre grafos orientados (dígrafos), ou não, e admite que todas as arestas possuem pesos não negativos (nulo é possível). a diferença do algoritmo de Dijkstra é que ele funciona em relação á origem, ja o algoritmo criado funciona entre todos os vertices do grafo.
