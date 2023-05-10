import java.util.Date;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[8];
        // Exemplos de Chefe
        funcionarios[0] = new Chefe("João", new Date(), 0, 10000);
        funcionarios[1] = new Chefe("Maria", new Date(), 0, 15000);

        // Exemplos de Vendedor
        funcionarios[2] = new Vendedor("Pedro", new Date(), 0, 2000, 0.05, 10);
        funcionarios[3] = new Vendedor("Ana", new Date(), 0, 2500, 0.07, 8);

        // Exemplos de Operario
        funcionarios[4] = new Operario("Carlos", new Date(), 0, 5, 100);
        funcionarios[5] = new Operario("Lucas", new Date(), 0, 10, 200);

        // Exemplos de Horista
        funcionarios[6] = new Horista("Paula", new Date(), 0, 50, 160);
        funcionarios[7] = new Horista("Camila", new Date(), 0, 60, 200);

        FolhaPagamento folhaPagamento = new FolhaPagamento(funcionarios);
        folhaPagamento.mostrarFolhaPagamento();
    }
}