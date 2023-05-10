public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", 2021, 1500);
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cilindradas: " + carro.getMotor().getCilindradas());
        System.out.println("Potência do motor: " + carro.getMotor().getPotencia());

        carro.acelerar();
        carro.acelerar();
        carro.frear();

        carro.setMotor(new Motor(2000));
        System.out.println("Nova cilindrada: " + carro.getMotor().getCilindradas());
        System.out.println("Nova potência do motor: " + carro.getMotor().getPotencia());

        //Quando um objeto é removido, todas as suas partes também são removidas junto com ele.
        //No exemplo acima, se um objeto Carro for removido, o objeto Motor que ele contém também será removido,
        //pois o motor é parte do carro.
        }
}
