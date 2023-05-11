public class Esfera extends FormaTridimensional {
    protected double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    public double obterVolume() {
        return 4.0 / 3 * Math.PI * raio * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
