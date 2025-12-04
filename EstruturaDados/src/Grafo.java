import java.util.*;

// Classe que representa um grafo genérico usando lista de adjacência
public class Grafo<T> {

    // Cada vértice guarda uma lista de arestas que saem dele
    private Map<T, List<Aresta<T>>> adjacencia;

    public Grafo() {
        adjacencia = new HashMap<>();
    }

    // Adiciona um vértice caso ele ainda não exista
    public void adicionarVertice(T valor) {
        if (!adjacencia.containsKey(valor)) {
            adjacencia.put(valor, new ArrayList<>());
        }
    }

    // Adiciona uma aresta entre dois vértices com certo peso
    public void adicionarAresta(T origem, T destino, double peso) {
        // Garantindo que os dois vértices existam no grafo
        adicionarVertice(origem);
        adicionarVertice(destino);

        // Criando a conexão origem -> destino
        adjacencia.get(origem).add(new Aresta<>(destino, peso));
    }

    // Retorna as arestas que saem de um vértice
    public List<Aresta<T>> getAdjacentes(T valor) {
        return adjacencia.get(valor);
    }

    // Retorna todos os vértices do grafo
    public Set<T> getVertices() {
        return adjacencia.keySet();
    }

    // Apenas imprime o grafo na tela
    public void imprimir() {
        for (T vertice : adjacencia.keySet()) {
            System.out.print(vertice + " -> ");

            for (Aresta<T> a : adjacencia.get(vertice)) {
                System.out.print(a.destino + "(" + a.peso + ") ");
            }

            System.out.println();
        }
    }
}
