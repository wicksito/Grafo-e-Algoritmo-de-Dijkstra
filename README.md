# Árvores Binárias e Recursividade

---

## 1. O que é recursividade?

Recursividade é quando uma função chama ela mesma para resolver um problema passo a passo. Em vez de tentar resolver tudo de uma só vez, ela pega um problema maior e transforma em partes menores, até chegar em um caso simples que ela consegue resolver direto, chamado de caso base. Depois disso, as respostas vão “voltando” conforme as chamadas anteriores são finalizadas.

## 2. Como a recursividade é usada na percorrência de uma árvore binária?

Para percorrer a árvore, basta dizer o que fazer com o nó atual e depois aplicar exatamente a mesma lógica para o filho da esquerda e para o filho da direita. A própria recursão se encarrega de continuar descendo nos nós automaticamente, sem que a gente precise controlar isso manualmente. Assim, a função vai explorando cada subárvore até chegar nas folhas, onde ela finalmente para e começa a retornar.

## 3. Qual a diferença entre recursão e laço (for/while)?

A diferença principal é o jeito que a repetição acontece. Nos laços for e while, a repetição é controlada dentro do próprio bloco, usando uma variável que vai mudando até que a condição pare de ser verdadeira. É uma repetição mais direta. Já na recursão, quem repete é a própria função chamando ela mesma, sempre com um problema menor até chegar em um caso simples. A lógica da repetição fica distribuída nas chamadas da função, não dentro de um laço.

