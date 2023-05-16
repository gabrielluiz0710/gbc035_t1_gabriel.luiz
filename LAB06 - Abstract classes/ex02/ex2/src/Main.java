public class Main {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial(1000.0f, 1234, 5678, 500.0f);
        ContaComum contaComum = new ContaComum(500.0f, 4321, 8765);

        contaEspecial.debitaValor(800.0f, 5678);
        System.out.println("Saldo da conta especial: " + contaEspecial.getSaldo(5678)); // Saldo da conta especial: 200.0

        contaComum.debitaValor(300.0f, 8765);
        System.out.println("Saldo da conta comum: " + contaComum.getSaldo(8765)); // Saldo da conta comum: 200.0
    }
}
