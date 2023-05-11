public class Tetraedro extends FormaTridimensional {
    protected double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    public double obterArea() {
        return Math.sqrt(3) * aresta * aresta;
    }

    public double obterVolume() {
        return aresta * aresta * aresta / (6 * Math.sqrt(2));
    }
}
