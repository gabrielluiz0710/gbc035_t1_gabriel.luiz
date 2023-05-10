import java.util.Date;

public class Operario extends Funcionario {
    private double valorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, Date dataNascimento, double salario, double valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double calcularSalario() {
        return valorProducao * quantidadeProduzida;
    }
}