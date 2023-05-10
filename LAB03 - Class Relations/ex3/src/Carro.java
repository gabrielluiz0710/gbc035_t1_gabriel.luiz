public class Carro {
    private String marca;
    private int ano;
    private Motor motor;

    public Carro(String marca, int ano, int cilindradas) {
        this.marca = marca;
        this.ano = ano;
        this.motor = new Motor(cilindradas);
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void acelerar() {
        motor.aumentarPotencia();
        System.out.println("O carro acelerou! Potência do motor: " + motor.getPotencia());
    }

    public void frear() {
        System.out.println("O carro freou!");
    }
}