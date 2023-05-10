import java.util.Date;

public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, Date dataNascimento, double salario, int horasTrabalhadas, double valorHora) {
        super(nome, dataNascimento, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return super.calcularSalario() + (horasTrabalhadas * valorHora);
    }
}