import java.util.Date;

public class FolhaPagamento {
    private Funcionario[] funcionarios;

    public FolhaPagamento(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void mostrarFolhaPagamento() {
        System.out.println("Folha de pagamento da empresa:");
        System.out.println("=============================");
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Salário: " + f.calcularSalario());
            System.out.println("-----------------------------");
        }
    }
}