public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1000.0f, 1111, 1234, 500.0f);
        ContaEspecial conta2 = new ContaEspecial(2000.0f, 2222, 5678, 1000.0f);

        // Testando débitos nas contas
        System.out.println("Saldo da conta1 antes do débito: " + conta1.getSaldo(1234));
        boolean debitoSucesso1 = conta1.debitaValor(800.0f, 1234);
        System.out.println("Débito na conta1 realizado: " + debitoSucesso1);
        System.out.println("Saldo da conta1 após o débito: " + conta1.getSaldo(1234));

        System.out.println("Saldo da conta2 antes do débito: " + conta2.getSaldo(5678));
        boolean debitoSucesso2 = conta2.debitaValor(2500.0f, 5678);
        System.out.println("Débito na conta2 realizado: " + debitoSucesso2);
        System.out.println("Saldo da conta2 após o débito: " + conta2.getSaldo(5678));
    }
}
