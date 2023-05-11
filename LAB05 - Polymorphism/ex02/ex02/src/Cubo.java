public class Cubo extends FormaTridimensional {
    protected double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double obterArea() {
        return 6 * aresta * aresta;
    }

    public double obterVolume() {
        return aresta * aresta * aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
