public class Figurinhas {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinhas(String pais) {
        this.nome = "Desconhecido";
        this.dataNascimento = "01/01/1900";
        this.altura = 1.70;
        this.peso = 65.0;
        this.posicao = "Desconhecida";
        this.pais = pais;
    }

    public Figurinhas(String nome, String dataNascimento, double altura, double peso, String posicao, String pais) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "\n\n\t\tNome = " + nome + "\n" +
                "\t\tNascimento = " + dataNascimento + "\n" +
                "\t\tAltura = " + altura + "\n" +
                "\t\tPeso = " + peso + "\n" +
                "\t\tPosição = " + posicao + "\n" +
                "\t\tPaís = " + pais + "\n";

    }
}