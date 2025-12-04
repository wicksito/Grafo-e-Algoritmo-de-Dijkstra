// Classe que representa uma aresta do grafo
// Cada aresta tem um destino e um peso
public class Aresta<T> {
    public T destino;
    public double peso;

    public Aresta(T destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }
}
