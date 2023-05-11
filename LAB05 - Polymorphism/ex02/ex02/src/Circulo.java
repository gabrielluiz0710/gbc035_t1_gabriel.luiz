public class Circulo extends FormaBidimensional {
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
