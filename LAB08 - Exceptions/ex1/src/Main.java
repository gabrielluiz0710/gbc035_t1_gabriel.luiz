public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("123456789", "João", 30000.0);
        System.out.println("Salário atual: " + funcionario.getSalario());

        try {
            funcionario.aumentarSalario(20);
            System.out.println("Salário após aumento: " + funcionario.getSalario());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            funcionario.aumentarSalario(-5000);
            System.out.println("Salário após aumento: " + funcionario.getSalario());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            funcionario.aumentarSalario(200);
            System.out.println("Salário após aumento: " + funcionario.getSalario());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
