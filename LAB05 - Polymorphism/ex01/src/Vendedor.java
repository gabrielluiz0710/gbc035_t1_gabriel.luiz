import java.util.Date;

public class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private int vendas;

    public Vendedor(String nome, Date dataNascimento, double salario, double valorFixo, double comissao, int vendas) {
        super(nome, dataNascimento, salario);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double calcularSalario() {
        return super.calcularSalario() + valorFixo + (comissao * vendas);
    }
}

