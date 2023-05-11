public class Quadrado extends FormaBidimensional {
    protected double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double obterArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
