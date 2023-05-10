import java.util.Date;

public class Operario extends Funcionario {
    private int producao;
    private double valorProducao;

    public Operario(String nome, Date dataNascimento, double salario, int producao, double valorProducao) {
        super(nome, dataNascimento, salario);
        this.producao = producao;
        this.valorProducao = valorProducao;
    }

    public double calcularSalario() {
        return super.calcularSalario() + (producao * valorProducao);
    }
}
