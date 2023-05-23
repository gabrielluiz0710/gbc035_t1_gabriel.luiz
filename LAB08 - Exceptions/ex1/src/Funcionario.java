public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalarial = 40000.0;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public void aumentarSalario(double percentual) {
        if (percentual < 0) {
            throw new IllegalStateException("Valor inválido de salário");
        }

        double novoSalario = salario + (salario * percentual / 100);
        if (novoSalario < 0) {
            throw new IllegalStateException("Valor inválido de salário");
        }

        if (novoSalario > tetoSalarial) {
            throw new IllegalStateException("Valor ultrapassa o teto");
        }

        salario = novoSalario;
    }
}
