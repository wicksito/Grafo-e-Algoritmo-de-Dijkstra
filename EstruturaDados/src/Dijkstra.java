import java.util.*;

// Implementação do algoritmo de Dijkstra para encontrar o menor caminho
public class Dijkstra<T> {

    public Map<T, Double> calcular(Grafo<T> grafo, T origem) {

        // Mapa que guarda a menor distância de cada vértice até a origem
        Map<T, Double> distancias = new HashMap<>();

        // Fila de prioridade para sempre pegar o vértice com menor distância
        PriorityQueue<Par<T>> fila = new PriorityQueue<>(Comparator.comparingDouble(p -> p.distancia));

        // Inicializa todas as distâncias como infinito
        for (T vertice : grafo.getVertices()) {
            distancias.put(vertice, Double.POSITIVE_INFINITY);
        }

        // A origem sempre começa com distância 0
        distancias.put(origem, 0.0);
        fila.add(new Par<>(origem, 0.0));

        // Enquanto ainda houver vértices para processar
        while (!fila.isEmpty()) {

            // Pegamos o vértice mais próximo encontrado até agora
            Par<T> atual = fila.poll();

            // Para cada aresta que sai dele
            for (Aresta<T> aresta : grafo.getAdjacentes(atual.valor)) {

                // Calcula o custo do caminho alternativo
                double novaDistancia = distancias.get(atual.valor) + aresta.peso;

                // Caso encontramos um caminho melhor, atualizamos
                if (novaDistancia < distancias.get(aresta.destino)) {
                    distancias.put(aresta.destino, novaDistancia);
                    fila.add(new Par<>(aresta.destino, novaDistancia));
                }
            }
        }

        return distancias;
    }
}

// Classe auxiliar para guardar o vértice e sua distância
class Par<T> { 
    T valor;
    double distancia;

    public Par(T valor, double distancia) {
        this.valor = valor;
        this.distancia = distancia;
    }
}
