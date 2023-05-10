public class Motor {
    private int cilindradas;
    private int potencia;

    public Motor(int cilindradas) {
        this.cilindradas = cilindradas;
        this.potencia = 100;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void aumentarPotencia() {
        potencia += 10;
    }

    public void diminuirPotencia() {
        potencia -= 10;
    }
}