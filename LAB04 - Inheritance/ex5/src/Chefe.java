import java.util.Date;

public class Chefe extends Funcionario {
    private double salarioFixo;

    public Chefe(String nome, Date dataNascimento, double salario, double salarioFixo) {
        super(nome, dataNascimento, salario);
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalario() {
        return salarioFixo;
    }
}