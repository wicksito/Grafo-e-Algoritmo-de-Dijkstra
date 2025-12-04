public class Main {
    public static void main(String[] args) {

        // Criando o grafo
        Grafo<String> grafo = new Grafo<>();

        // Adicionando arestas (com pesos)
        grafo.adicionarAresta("A", "B", 4);
        grafo.adicionarAresta("A", "C", 2);
        grafo.adicionarAresta("C", "B", 1);
        grafo.adicionarAresta("B", "D", 5);
        grafo.adicionarAresta("C", "D", 8);

        System.out.println("Grafo:");
        grafo.imprimir();

        // Executando o algoritmo de Dijkstra
        Dijkstra<String> dijkstra = new Dijkstra<>();
        var dist = dijkstra.calcular(grafo, "A");

        System.out.println("\nDistâncias mínimas a partir de A:");
        dist.forEach((v, d) -> System.out.println(v + " = " + d));
    }
}
