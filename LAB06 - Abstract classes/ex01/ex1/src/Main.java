public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente com saldo inicial de 1000, número 123 e senha 456
        ContaCorrente conta = new ContaCorrente(1000, 123, 456);

        // Obtendo o saldo da conta
        float saldo = conta.getSaldo(456);
        System.out.println("Saldo inicial: R$ " + saldo);

        // Debitando um valor da conta
        boolean debito1 = conta.debitaValor(500, 456);
        System.out.println("Débito de R$ 500 realizado: " + debito1);

        // Verificando o novo saldo
        saldo = conta.getSaldo(456);
        System.out.println("Novo saldo: R$ " + saldo);

        // Tentando debitar um valor maior que o saldo disponível
        boolean debito2 = conta.debitaValor(800, 456);
        System.out.println("Débito de R$ 800 realizado: " + debito2);

        // Creditando um valor na conta
        conta.creditaValor(456, 200);
        System.out.println("Crédito de R$ 200 realizado");

        // Verificando o saldo novamente
        saldo = conta.getSaldo(456);
        System.out.println("Saldo atual: R$ " + saldo);

        // Verificando o estado da conta
        int estado = conta.getEstado(456);
        System.out.println("Estado da conta: " + estado);

        // Tentando modificar o estado da conta com senha inválida
        conta.setEstado(111, 2);

        // Modificando o estado da conta com senha válida
        conta.setEstado(456, 2);
        System.out.println("Estado da conta alterado para 2 (inativa)");

        // Tentando debitar valor de uma conta inativa
        boolean debito3 = conta.debitaValor(200, 456);
        System.out.println("Débito de R$ 200 realizado em conta inativa: " + debito3);
    }
}
